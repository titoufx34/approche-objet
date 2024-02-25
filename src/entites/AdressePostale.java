package entites;

public class AdressePostale {
    public int numeroderue;
    public String libellederue;
    public int codepostal;
    public String ville;

    public AdressePostale() {

    }

    public AdressePostale(int numeroderue, String libellederue, int codepostal, String ville) {
        this.numeroderue = numeroderue;
        this.libellederue = libellederue;
        this.codepostal = codepostal;
        this.ville = ville;
    }

    public int getNumeroderue() {
        return numeroderue;
    }

    public int getCodepostal() {
        return codepostal;
    }

    public String getVille() {
        return ville;
    }

    public String getLibellederue() {
        return libellederue;
    }
}

