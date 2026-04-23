package Strategy;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ItineraireCalculator itineraireCalculator = new ItineraireCalculator();

        Point depart = new Point(20, 300);
        Point arrivee = new Point(600, 500);

        // Le choix du strategy (L'algo a execute)
        RouteStrategy strategy = new VoitureStrategy(); //VeloStrategy(); //new PietonStrategy();

        itineraireCalculator.setStrategy(strategy);
        itineraireCalculator.calculer(depart, arrivee);

       // itineraireCalculator.calculer(depart, arrivee, "voiture");
        //itineraireCalculator.calculer(depart, arrivee, "velo");


        //itineraireCalculator.calculer(depart, arrivee, "");



    }
}
