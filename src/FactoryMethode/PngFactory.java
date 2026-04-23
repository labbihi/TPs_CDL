package FactoryMethode;

public class PngFactory extends FactoryExporter{
    @Override
    protected Exporter createExporter() {
        return new PngExporter();
    }
}
