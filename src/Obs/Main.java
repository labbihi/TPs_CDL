package Obs;

public class Main {

    public static void main(String[] args) {

        // Utilisation
        WeatherData station = new WeatherData();



        System.out.println("- Etape 1 :");

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        station.addObserver(currentConditionsDisplay);
        station.addObserver(new AlertSystem());

        station.setMesures(36.5f, 65, 1013); // déclenche l'alerte


        System.out.println("- Etape 2 :");

        station.addObserver(new StatisticsDisplay());
        station.setMesures(32.5f, 80, 1040);

        System.out.println("- Etape 3 :");
        station.removeObserver(currentConditionsDisplay);

        station.setMesures(40.5f, 50, 80);




    }
}
