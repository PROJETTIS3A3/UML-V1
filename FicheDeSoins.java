package Hôpital;

import java.util.ArrayList; 

public class FicheDeSoins {

    private String observation;

    private Date date;

    private ArrayList<Acte> acte;

    public FicheDeSoins (Patient patient, Medecin medecin, Date date, String observation) {
        this.observation=observation;
        this.date=date;
    }

    public Patient getPatient () {
        return null;
    }

    public Medecin getMedecin () {
        return null;
    }

    public Date getDate () {
        return null;
    }

    public void ajouterActe (Acte acte) {
    }

    public void ajouterActe (Code code, int coefficient) {
    }

    public void afficher () {
    }

    public double coutTotal () {
        return 0.0;
    }

    public ArrayList<Acte> getActe () {
        return acte;
    }

    public void setActe (ArrayList<Acte> val) {
        this.acte = val;
    }

    public Date getDate () {
        return date;
    }

    public void setDate (Date val) {
        this.date = val;
    }

    public String getObservation () {
        return observation;
    }

    public void setObservation (String val) {
        this.observation = val;
    }

}

