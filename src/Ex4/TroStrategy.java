package Ex4;

import java.awt.*;

public class TroStrategy extends Strategy {


    @Override
    public Itineraire calculer(Point depart, Point arrive) {
        Itineraire itineraire = new Itineraire();
        super.tmep = 30.30F;
        System.out.println("Moyen Tronttinte");

        return itineraire;
    }
}
