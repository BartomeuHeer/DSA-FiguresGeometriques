package edu.upc.eetac.dsa;
import java.util.Arrays;

public class FiguresMain {

    public static void main(String[] args) {

        FiguresGeometriques F1 = new Cercle (10);
        Cercle c = (Cercle) F1;
        c.calculArea();
        double areac = c.getArea();

        FiguresGeometriques F2 = new Triangle (5,6);
        Triangle t = (Triangle) F2;
        t.calculArea();
        double areat = t.getArea();

        FiguresGeometriques F3 = new Rectangle (7,10);
        Rectangle r = (Rectangle) F3;
        r.calculArea();
        double arear = r.getArea();

        FiguresGeometriques F4 = new Quadrat (9);
        Quadrat q = (Quadrat) F4;
        q.calculArea();
        double areaq = q.getArea();

        FiguresGeometriques F5 = new Cercle (8);
        Cercle c2 = (Cercle) F5;
        c2.calculArea();
        double areac2 = c2.getArea();

        double [] VectorFigures = {areac,areat,arear,areaq,areac2};

        Arrays.sort(VectorFigures);
        for (double area: VectorFigures) {
            System.out.println(area);
    }
}

