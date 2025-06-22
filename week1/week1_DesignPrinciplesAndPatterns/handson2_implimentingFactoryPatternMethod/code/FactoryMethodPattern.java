interface Document {
    void open();

    void save();
}

abstract class DocumentFactory {
    public abstract Document createDocument();
}

// ExcelDoc
class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel");
    }

    @Override
    public void save() {
        System.out.println("Saving Excel");
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}

// PdfDoc
class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF");
    }
}

class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

// WordDoc
class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word");
    }

    @Override
    public void save() {
        System.out.println("Saving Word");
    }
}

class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

public class FactoryMethodPattern {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDocument = wordFactory.createDocument();
        wordDocument.open();
        wordDocument.save();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDocument = pdfFactory.createDocument();
        pdfDocument.open();
        pdfDocument.save();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDocument = excelFactory.createDocument();
        excelDocument.open();
        excelDocument.save();
    }
}
