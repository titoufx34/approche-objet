package fr.epsi.banque.entites;

public class CompteTaux extends Compte{
    private double taux;

    public CompteTaux(int numerocompte, double soldecompte, double taux) {
        super(numerocompte, soldecompte);
        this.taux = taux;
    }

    @Override
    public String toString() {
        return super.toString() + "CompteTaux{" +
                "taux=" + taux +
                '}';
    }
}

