package Strategy;

import java.awt.*;

public interface RouteStrategy {

    public Itineraire calculer(Point depart, Point arrivee);
}
