package Hôpital;

public abstract class ComparaisonFicheDates implements Affichage {

    public ComparaisonFicheDates() {
    }

    public int comparer(FicheDeSoins fiche1, FicheDeSoins fiche2) {
        return fiche1.getDate().compareTo(fiche2.getDate());
    }

    public abstract int trier();

}

