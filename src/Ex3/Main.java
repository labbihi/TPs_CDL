package Ex3;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        System.out.println("Etape 1 : ");
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        weatherData.addObserver(currentConditionsDisplay);
        weatherData.addObserver(new AlertSystem());
        weatherData.setMesures(30, 50, 40);

        System.out.println("Etape 2 : ");

        weatherData.addObserver(new CurrentConditionsDisplay());
        weatherData.addObserver(new StatisticsDisplay());
        weatherData.setMesures(36, 20, 50);


        System.out.println("Etape 3 : ");
        weatherData.removeObserver(currentConditionsDisplay);
        weatherData.addObserver(new NewDisplay());

        weatherData.setMesures(30, 50, 40);
    }
}
