package Strategy;

import java.awt.*;

public class ItineraireCalculator {

    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public Itineraire calculer(Point depart, Point arrivee) {
        System.out.println("Itineraire calculator");
        return strategy.calculer(depart, arrivee);
    }




    /*
    public Itineraire calculer(Point depart, Point arrivee, String moyen) {
        Itineraire itineraire = new Itineraire();
        if (moyen.equals("voiture")) {
            // algorithme voiture
            System.out.println("Utlistaion de voiture");
        } else if (moyen.equals("velo")) {
            // algorithme vélo
            System.out.println("Utlistaion de velo");
        } else {
            System.out.println("Utlisateur pieton");

        }
        return itineraire;
    }

     */
}
