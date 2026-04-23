package FactoryMethode;

public class SvgFactory extends FactoryExporter{
    @Override
    protected Exporter createExporter() {
        return new SvgExporter();
    }
}
