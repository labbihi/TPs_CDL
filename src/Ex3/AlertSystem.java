package Ex3;

public class AlertSystem implements Observer {


    public void verifier(float temp){
        System.out.println("=========== Alert System ==========="  );
        if(temp>35){
            System.out.println("Evoyer SMS..........");
        }else {
            System.out.println("Pas d'SMS........");
        }

        System.out.println("=========== Alert System ==========="  );
    }


    @Override
    public void update(float temp, float humidite, float pression) {
        this.verifier(temp);

    }
}
