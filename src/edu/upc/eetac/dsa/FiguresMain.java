package edu.upc.eetac.dsa;
import java.sql.Array;
import java.util.Arrays;

public class FiguresMain {

    public static double suma(FiguresGeometriques[] v) {
        double sum = 0;
        for (FiguresGeometriques f: v) {
            sum+=f.calculArea();;
        }
        return sum;
    }

    public static void main(String[] args) {

        FiguresGeometriques[] vector = new FiguresGeometriques[5];
        FiguresGeometriques F1 = new Cercle(10);
        Cercle c = (Cercle) F1;


        FiguresGeometriques F2 = new Triangle(5, 6);
        Triangle t = (Triangle) F2;


        FiguresGeometriques F3 = new Rectangle(7, 10);
        Rectangle r = (Rectangle) F3;


        FiguresGeometriques F4 = new Quadrat(9);
        Quadrat q = (Quadrat) F4;


        FiguresGeometriques F5 = new Cercle(8);
        Cercle c2 = (Cercle) F5;

        vector[0]=c;
        vector[1]=t;
        vector[2]=r;
        vector[3]=q;
        vector[4]=c2;

        Arrays.sort(vector);

        for (FiguresGeometriques f: vector) {
           System.out.println(f.calculArea());
        }
        System.out.println(suma(vector));
    }
}

