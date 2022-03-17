package edu.upc.eetac.dsa;

import java.util.Collection;
import java.util.Iterator;

public class Triangle extends FiguresGeometriques {
    private double area;
    private double base;
    private double altura;

    public Triangle(double b, double a){
        this.altura = a;
        this.base = b;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    @Override
    public double calculArea() {
        return (base*altura)/2;
    }



}
