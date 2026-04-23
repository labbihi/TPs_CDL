package Ex4;

import java.awt.*;

public abstract class Strategy {

    protected Float tmep;

    public abstract Itineraire calculer(Point depart, Point arrive);
}
