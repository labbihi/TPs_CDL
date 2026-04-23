package Ex2;

public class PngFactory extends Factory{

    @Override
    public Expo create() {
        PngExpo expo = new PngExpo();
        return expo;
    }
}
