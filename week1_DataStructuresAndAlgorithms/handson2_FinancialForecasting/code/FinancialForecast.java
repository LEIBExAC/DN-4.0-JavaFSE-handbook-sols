package week1_DataStructuresAndAlgorithms.handson2_FinancialForecasting.code;
public class FinancialForecast {
    public static double futureValue(double initialPrice, double growthRate, int years) {
        if (years == 0) {
            return initialPrice;
        }
        return futureValue(initialPrice, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialPrice = 500.0;
        double growthRate = 0.05;
        int years = 5;

        for (int year = 1; year <= years; year++) {
            double result = futureValue(initialPrice, growthRate, year);
            System.out.println("Future value after " + years + " years:" + result);
        }
    }
}
