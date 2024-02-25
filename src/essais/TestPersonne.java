package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

    /*public static void main(String[] args) {
        Personne personne1 = new Personne("Jarre", "Jean Michel");
        Personne personne2 = new Personne("Punk", "Daft");
    }*/

    public static void main(String[] args) {
        Personne personne1 = new Personne("Jarre", "Jean Michel", new AdressePostale(25, "rue oxygene", 44300, "Nantes"));
        Personne personne2 = new Personne("Punk", new String("Daft"), new AdressePostale(33, "rue Discovery", 75015, "Paris"));


        personne1.displayNom();
        personne1.displayAdresse();
        personne1.setAdresse(new AdressePostale( 50,"rue retraite",49000,"Angers"));
        personne1.displayAdresse();

    }


}
