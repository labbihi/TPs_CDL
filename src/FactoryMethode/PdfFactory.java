package FactoryMethode;

public class PdfFactory extends FactoryExporter{
    @Override
    protected Exporter createExporter() {
        PdfExporter exporter = new PdfExporter();
        return exporter;
    }
}
