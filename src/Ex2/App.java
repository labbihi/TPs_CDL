package Ex2;

public class App {

    public static void executer(Factory factory, Diagramme diagramme) {
        //Factory factory = new SvgFactory(); //PngFactory(); //choix
        Expo expo = factory.create();
        expo.exporter(diagramme);
    }

    public static void main(String[] args) {


        Diagramme diagramme = new Diagramme();
        diagramme.setNom("Diagramme de calasse 1");

        Factory factory = new PdfFactory(); //SvgFactory();
        executer(factory, diagramme);



       /* String format = "SVG";



        if(format.equals("PNG")){
            Expo expo = new PngExpo();
            expo.exporter(diagramme);

        }else if(format.equals("SVG")){
            Expo expo = new SvgExpo();
            expo.exporter(diagramme);
        }else if(format.equals("PDF")){
            Expo expo = new PdfExpo();
            expo.exporter(diagramme);
        }
*/

    }



}
