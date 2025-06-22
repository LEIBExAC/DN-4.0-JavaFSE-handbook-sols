import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String toString() {
        return productId + " - " + productName + " (" + category + ")";
    }
}

public class EcommercePlatformSearchFunction {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Tablet", "Electronics"),
            new Product(4, "Smartwatch", "Electronics"),
            new Product(5, "Bluetooth Speaker", "Electronics"),
            new Product(6, "Wireless Mouse", "Accessories"),

        };

        Product[] sortedProducts = products.clone();
        Arrays.sort(sortedProducts, Comparator.comparing(p -> p.productName.toLowerCase()));

        Product result1 = linearSearch(products, "Wireless Mouse");
        System.out.println("Linear Search Result: " + result1);

        Product result2 = binarySearch(sortedProducts, "Wireless Mouse");
        System.out.println("Binary Search Result: " + result2);
    }

    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String name) {
        int left = 0, right = products.length - 1;
        name = name.toLowerCase();
        while (left <= right) {
            int mid = (left + right) / 2;
            String midName = products[mid].productName.toLowerCase();
            if (midName.equals(name)) return products[mid];
            if (midName.compareTo(name) < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
}
