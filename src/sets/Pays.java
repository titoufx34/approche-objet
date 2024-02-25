package sets;

public class Pays {
    private String nom;
    private int nbehabitants;
    private double pibparhabitants;

    public Pays(String nom, int nbehabitants, double pibparhabitants) {
        this.nom = nom;
        this.nbehabitants = nbehabitants;
        this.pibparhabitants = pibparhabitants;
    }

    public String getNom() {
        return nom;
    }

    public int getNbehabitants() {
        return nbehabitants;
    }

    public double getPibparhabitants() {
        return pibparhabitants;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbehabitants(int nbehabitants) {
        this.nbehabitants = nbehabitants;
    }

    public void setPibparhabitants(double pibparhabitants) {
        this.pibparhabitants = pibparhabitants;
    }



    @Override
    public String toString() {
        return "{"+nom+ ", " +nbehabitants + " habitants, "
                + pibparhabitants + " pib/habitants}";
    }


}
