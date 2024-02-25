package entites;

public class Personne {
    private String nom;
    private String prenom;
    private AdressePostale adresse;


// constructeurs
    public Personne(String nom, String prenom) {
        this(nom, prenom,new AdressePostale());
    }

    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom.toUpperCase();
        this.prenom = prenom;
        this.adresse = adresse;
    }
// methode affichage nom
    public void displayNom() {
        System.out.println(nom + " " + prenom);


    }

// methode affichage nom
    public void displayAdresse() {
        System.out.println(adresse.getNumeroderue()+" "+adresse.getLibellederue()+" "+adresse.getCodepostal()+" "+adresse.getVille());

    }

// getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public AdressePostale getAdresse() {
        return adresse;
    }

// setters
    public void setNom(String nom) {
        this.nom = nom.toUpperCase();
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(AdressePostale adresse) {
        this.adresse = adresse;
    }
}



