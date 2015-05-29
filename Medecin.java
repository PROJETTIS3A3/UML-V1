package Hôpital;


public class Medecin {

    private String nom;

    private String prenom;

    private String specialite;

    private String adresse;

    private String numeroTel;

    private String login;

    private String motDePasse;

    public Medecin (String nom, String prenom, String specialite, String adresse, String numeroTel, String login, String motDePasse) {
    this.nom=nom;
    this.prenom=prenom;
    this.specialite=specialite;
    this.adresse=adresse;
    this.numeroTel=numeroTel;
    this.login=login;
    this.motDePasse=motDePasse;
    }

    public String getSpecialite () {
        return specialite;
    }

    public String toString () {
        return null;
    }

    public boolean equals (Object o) {
        return true;
    }

    public String getAdresse () {
        return adresse;
    }

    public void setAdresse (String val) {
        this.adresse = val;
    }

    public String getLogin () {
        return login;
    }

    public void setLogin (String val) {
        this.login = val;
    }

    public String getMotDePasse () {
        return motDePasse;
    }

    public void setMotDePasse (String val) {
        this.motDePasse = val;
    }

    public String getNumeroTel () {
        return numeroTel;
    }

    public void setNumeroTel (String val) {
        this.numeroTel = val;
    }

}

