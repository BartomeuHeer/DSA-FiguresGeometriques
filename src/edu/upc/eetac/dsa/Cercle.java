package edu.upc.eetac.dsa;

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
    public void calculArea() {
        area = Math.PI*Math.pow(radi,2);
    }
}
