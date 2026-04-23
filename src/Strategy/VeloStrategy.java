package Strategy;

import java.awt.*;

public class VeloStrategy implements RouteStrategy {


    @Override
    public Itineraire calculer(Point depart, Point arrivee) {
        System.out.println("Velo calculator");
        return new Itineraire();
    }
}
