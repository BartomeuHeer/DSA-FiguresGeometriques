package edu.upc.eetac.dsa;

import java.util.Collection;
import java.util.Iterator;

public class Cercle extends FiguresGeometriques{
    private double radi;
    private double area;



    public Cercle(double r){
        this.radi = r;
    }

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    public double getArea() {
        return area;
    }

    @Override
    public double calculArea() {
        return (Math.PI*Math.pow(radi,2));
    }


}

