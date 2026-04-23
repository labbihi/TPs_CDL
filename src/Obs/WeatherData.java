package Obs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WeatherData {

    private float temp;

    private float humidite;

    private float pression;

    private List<Observer> observers = new ArrayList<Observer>() ;




    public  void  addObserver(Observer observer){
        observers.add(observer);
    }

    public  void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public  void notifyObservers(){
        for(Observer observer : observers){
            observer.update(temp, humidite, pression);
        }
    }


    public void setMesures(float temp, float humidite, float pression) {
        this.temp = temp;
        this.humidite = humidite;
        this.pression = pression;
        //currentDisplay.actualiser(temp, humidite, pression);
        //statsDisplay.actualiser(temp, humidite, pression);
        //alertSystem.verifier(temp, humidite, pression);

        notifyObservers();
    }

}
