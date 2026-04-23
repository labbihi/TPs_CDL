package Obs;

public class CurrentConditionsDisplay implements Observer{

    public void update(float temp, float humidite, float pression) {
        System.out.println("---------- Current Conditions Display --------------");
        System.out.println("Temp: " + temp);
        System.out.println("Humidite: " + humidite);
        System.out.println("Pression: " + pression);
        System.out.println("---------- -------------- --------------");

    }
}
