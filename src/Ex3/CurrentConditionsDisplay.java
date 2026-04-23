package Ex3;

public class CurrentConditionsDisplay implements Observer {

    public void actualiser(float temp, float humidite, float pression){
        System.out.printf("-------------- Current Conditions Display ---------------\n");
        System.out.printf("Temp "+"%.2f\n",temp);
        System.out.printf("Humidite "+"%.2f\n",humidite);
        System.out.printf("Pressure "+"%.2f\n",pression);
        System.out.printf("------------------------------");
    }

    @Override
    public void update(float temp, float humidite, float pression) {
        this.actualiser(temp, humidite, pression);
    }
}
