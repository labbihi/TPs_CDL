package Ex4;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        ItineraireCalculator itineraireCalculator = new ItineraireCalculator();

        Point depart = new Point(0,0);
        Point arrive = new Point(30,60);

        Strategy strategy = new TroStrategy(); //VeloStategy();  //VoitureStrategy();

        itineraireCalculator.setStrategy(strategy);

        Itineraire itineraire =  itineraireCalculator.getItineraire(depart, arrive);


    }
}
