package edu.upc.eetac.dsa;

import java.util.Collection;
import java.util.Iterator;

public class Rectangle extends FiguresGeometriques{
    private double costat;
    private double base;
    private double area;
    public Rectangle(double c, double b){
        this.costat = c;
        this.base = b;
    }
    public double getBase() {
        return base;
    }

    public double getCostat() {
        return costat;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setCostat(double costat) {
        this.costat = costat;
    }

    public double getArea() {
        return area;
    }

    @Override
    public double calculArea() {
        return base*costat;
    }




}

