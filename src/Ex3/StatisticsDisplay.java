package Ex3;

public class StatisticsDisplay implements Observer {

    @Override
    public void update(float temp, float humidite, float pression){
        System.out.printf("*************** Statistics Display **************\n");
        System.out.printf("Temp "+"%.2f\n",temp);
        System.out.printf("Humidite "+"%.2f\n",humidite);
        System.out.printf("Pressure "+"%.2f\n",pression);
        System.out.printf("********************");
    }
}
