package Obs;

public class StatisticsDisplay implements Observer {


    public void update(float temp, float humidite, float pression) {
        System.out.println("=============== Statistics Display -==============");
        System.out.println("Temp: " + temp);
        System.out.println("Humidite: " + humidite);
        System.out.println("Pression: " + pression);
        System.out.println("==============================");

    }
}
