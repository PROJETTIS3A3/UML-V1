package Hôpital;

import java.util.ArrayList; 
import java.util.Vector;

public class DossierMedical {
    
    private Patient patient;
    
    private Medecin medecin;

    private ArrayList<DossierPatient> mDossierPatient;

    private ArrayList<Medecin> mMedecin;

    private ArrayList<Administration> mAdministration;

    private Affichage mAffichage;

    public DossierMedical () {
        mDossierPatient = new ArrayList<DossierPatient>();     // création des listes vides
        mMedecin = new ArrayList<Medecin>();                   // ici aussi
        mAdministration = new ArrayList<Administration>();     // et ici aussi
    }

    public void ajouterDossierPatient (DossierPatient dossierPatient) {
        mDossierPatient.add(dossierPatient);
    }
    
    public void ajouterMedecin (Medecin medecin) {
        mMedecin.add(medecin);
    }
    
    public void ajouterAdministration (Administration administration) {
        mAdministration.add(administration);
    }

    public void afficher () {
        System.out.println("Dossier patient :");
        System.out.println("-----------------------------");
        for (int i = 0; i < mDossierPatient.size(); i++) {
            DossierPatient d = mDossierPatient.get(i);
            d.afficher();
            // pour separer les fiches de soins :
            System.out.println("--------------------------------------");
        }
    }

    public double coutPatient (Patient p) {
        return 0.0;
    }

    public double coutMedecin (Medecin m) {
        return 0.0;
    }

    public double coutSpecialite (String specialite) {
        return 0.0;
    }

    public void afficherListePatients (Medecin m) {
    }

    public int nombreFichesIntervalle (Date d1, Date d2) {
        return 0;
    }

    public void trierDates () {
    }

    public void trier (Affichage c) {
    }

    public ArrayList<Administration> getAdministration () {
        return mAdministration;
    }

    public void setAdministration (ArrayList<Administration> val) {
        this.mAdministration = val;
    }

    public Affichage getAffichage () {
        return mAffichage;
    }

    public void setAffichage (Affichage val) {
        this.mAffichage = val;
    }

    public ArrayList<DossierPatient> getDossierPatient () {
        return mDossierPatient;
    }

    public void setDossierPatient (ArrayList<DossierPatient> val) {
        this.mDossierPatient = val;
    }

    public ArrayList<Medecin> getMedecin () {
        return mMedecin;
    }

    public void setMedecin (ArrayList<Medecin> val) {
        this.mMedecin = val;
    }

}

