package Ex4;

import java.awt.*;

public class ItineraireCalculator {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }


    public Itineraire getItineraire(Point depart, Point arrive) {

        return strategy.calculer(depart, arrive);
    }




    /*
    public Itineraire calculer(Point depart, Point arrivee, String moyen) {

        if (moyen.equals("voiture")) {
            // algorithme voiture
            System.out.println("Moyen du voiture");

            return new Itineraire();
        } else if (moyen.equals("velo")) {
            // algorithme vélo
            System.out.println("Moyen du velo");
            return new Itineraire();
        } else {
            System.out.println("Moyen Pieton");
            return new Itineraire();
        }


    }
*/
}
