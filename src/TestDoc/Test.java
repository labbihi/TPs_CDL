package TestDoc;


/**
 * C'est une class de Test de documentation
 */
public class Test {


    /**
     * Calcule la somme des entiers compris entre deux bornes.
     * @param debut le debut de la somme
     * @param fin la fin de la somme
     * @return la sommme des entiers compris entre deux bornes.
     * @throws IllegalAccessError si debut > fin
     */
    public int somme(int debut, int fin) {
        // Un exeption si le debut > a fin
        if (debut > fin) {
            throw new IllegalArgumentException("debut doit être <= fin");
        }

        int total = 0;
        for (int i = debut; i <= fin; i++) {
            total += i;
        }
        return total;
    }


}
