package Ex2;

public class PdfFactory extends Factory {


    @Override
    public Expo create() {
        PdfExpo expo = new PdfExpo();
        return expo;
    }
}
