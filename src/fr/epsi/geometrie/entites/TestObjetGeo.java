package fr.epsi.geometrie.entites;

public class TestObjetGeo {
    public static void main(String[] args) {

        ObjetGeometrique[] tableau = new ObjetGeometrique[2];
        Cercle c1 = new Cercle(10);
        Rectangle r1 = new Rectangle(4,5);
        tableau[0] = c1;

        for (ObjetGeometrique i : tableau){
            System.out.printf("la surface de %s est de %.02f et sa surface de %.02f%n", i, i.perimetre(), i.surface());
        }

    }
}
