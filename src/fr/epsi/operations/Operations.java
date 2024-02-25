package fr.epsi.operations;

public class Operations {

    public static double calcul(double a, double b, char c) {
        double r = 0;

        if (c == '+') {
            r = a + b;
        }

        if (c == '-') {
            r = a - b;
        }

        if (c == '*') {
            r = a * b;
        }

        if (c == '/') {
            r = a / b;
        }

       // double r;
        return r;
    }
}
