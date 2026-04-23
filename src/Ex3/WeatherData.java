package Ex3;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {


    private float temp  ;
    private float humidite;

    private float pression;
    private List<Observer> ListObservers ;



    public WeatherData(){
        this.ListObservers = new ArrayList<>();
    }




    public void setMesures(float temp, float humidite, float pression) {
        this.temp = temp;
        this.humidite = humidite;
        this.pression = pression;

       this.notifyObservers();

    }

    public void addObserver(Observer observer){
        this.ListObservers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.ListObservers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer : ListObservers){
            observer.update(temp,humidite,pression);
        }
    }



}

