package Strategy;

import java.awt.*;

public class VoitureStrategy implements RouteStrategy{
    @Override
    public Itineraire calculer(Point depart, Point arrivee) {
        System.out.println("Voiture calculator");
        return new Itineraire();
    }
}
