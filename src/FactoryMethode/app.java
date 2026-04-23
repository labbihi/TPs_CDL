package FactoryMethode;

public class app {

    public static void main(String[] args) {
        Diagramme diagramme = new Diagramme();

       /*
        FactoryExporter factoryExporter = new PdfFactory(); // le choix
        Exporter exporter = factoryExporter.createExporter();
        exporter.exporter(diagramme);

       */

        String format = "PNG";

        if (format.equals("PNG")) {
             PngExporter exporter = new PngExporter();
             exporter.exporter(diagramme);
        } else if (format.equals("SVG")) {

        }else if (format.equals("PDF")) {
            PdfExporter exporter = new PdfExporter();
            exporter.exporter(diagramme);
        }

    }
}
