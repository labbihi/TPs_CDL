package Obs;

public class AlertSystem implements Observer {


    public void verifier(float temp, float humidite, float pression) {
        System.out.println("**********************  Alert System **********************");
        if(temp > 34){
            System.out.println("Send SMS ....");
        }else {
            System.out.println("No alert send");
        }
        System.out.println("********************************************");
    }

    @Override
    public void update(float temp, float humidite, float pression) {
        verifier(temp, humidite, pression);
    }
}
