package fr.epsi.banque.entites;

public class Compte {
    private int numerocompte;
    private double soldecompte;

//constructeurs
    public Compte(int numerocompte, double soldecompte) {
        this.numerocompte = numerocompte;
        this.soldecompte = soldecompte;
    }

    public Compte() {
    }

//getter
    public int getNumerocompte() {
        return numerocompte;
    }
//getter
    public double getSoldecompte() {
        return soldecompte;
    }

//setter
    public void setNumerocompte(int numerocompte) {
        this.numerocompte = numerocompte;
    }
//setter
    public void setSoldecompte(double soldecompte) {
        this.soldecompte = soldecompte;
    }

    /* polymorphisme, on modifie la classe toString de Java pour afficher non plus la reference dans la pile
    mais les variables qui nous interessent*/
    @Override
    public String toString() {
        return "Compte{" +
                "numerocompte=" + numerocompte +
                ", soldecompte=" + soldecompte +
                '}';
    }
}
