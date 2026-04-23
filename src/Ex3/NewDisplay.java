package Ex3;

public class NewDisplay implements Observer {


    @Override
    public void update(float temp, float humidite, float pression) {
        System.out.println("New Display");

    }
}
