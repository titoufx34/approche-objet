package fr.epsi.banque.entites;

public class Debit extends Operation{

//constructeur
    public Debit(String date, double montantoperation) {
        super(date, montantoperation);
    }

//methode

    @Override
    public String affType() {
        return "Debit";
    }
}
