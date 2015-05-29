package Hôpital;

public class Patient {

    private String nom;
    private String prenom;
    private Medecin medecinTraitant;
    private Date dateDeNaissance;
    private String lieuDeNaissance;
    private String sexe;

    public Patient(String nom, String prenom, Medecin medecinTraitant, Date dateDeNaissance, String lieuDeNaissance, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.medecinTraitant=medecinTraitant;
        this.dateDeNaissance=dateDeNaissance;
        this.lieuDeNaissance=lieuDeNaissance;
        this.sexe=sexe;
    }

    public String toString() {
        return null;
    }

    public boolean equals(Object o) {
        return true;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date val) {
        this.dateDeNaissance = val;
    }

    public String getLieuDeNaissance() {
        return lieuDeNaissance;
    }

    public void setLieuDeNaissance(String val) {
        this.lieuDeNaissance = val;
    }

    public Medecin getMedecinTraitant() {
        return medecinTraitant;
    }

    public void setMedecinTraitant(Medecin val) {
        this.medecinTraitant = val;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String val) {
        this.sexe = val;
    }
}

