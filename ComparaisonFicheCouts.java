package Hôpital;


public abstract class ComparaisonFicheCouts implements Affichage {

    public ComparaisonFicheCouts () { 
    }

    public int comparer (FicheDeSoins fiche1, FicheDeSoins fiche2) {
        Double c1 = new Double(fiche1.coutTotal());
        Double c2 = new Double(fiche2.coutTotal());
        return c1.compareTo(c2);
        }

    public abstract int trier();
}

