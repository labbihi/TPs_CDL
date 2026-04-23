package Strategy;

import java.awt.*;

public class PietonStrategy implements RouteStrategy{
    @Override
    public Itineraire calculer(Point depart, Point arrivee) {
        System.out.println("Pieton calculator");
        return new Itineraire();
    }
}
