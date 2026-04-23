package Ex4;

import java.awt.*;

public class VoitureStrategy extends Strategy{


    @Override
    public Itineraire calculer(Point depart, Point arrive) {
        Itineraire itineraire = new Itineraire();

        super.tmep = 10.4F;



        System.out.println("Moyen Voiture");

        return itineraire;
    }
}
