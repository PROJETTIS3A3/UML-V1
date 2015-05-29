package Hôpital;

import Hôpital.FicheDeSoins;
import Hôpital.Medecin;
import Hôpital.Patient;
import java.util.ArrayList;

public class DossierPatient {

    private Patient mPatient;
    private Medecin medecin;
    private Date date;
    private ArrayList<FicheDeSoins> mFicheDeSoins;

    public DossierPatient(Patient patient, Medecin medecin) {
    }

    void afficher() {
        System.out.println("Fiche de soins du " + date.toString());
        System.out.println("- medecin : " + medecin.toString());
        System.out.println("- patient : " + mPatient.toString());
        System.out.println("- actes medicaux :");
        for (int i = 0; i < mFicheDeSoins.size(); i++) {
            FicheDeSoins f = mFicheDeSoins.get(i);
            System.out.println("    > " + f.toString());
        }
    }
}

