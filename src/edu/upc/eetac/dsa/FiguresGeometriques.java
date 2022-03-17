package edu.upc.eetac.dsa;

import java.util.Collection;

public abstract class FiguresGeometriques implements Comparable<FiguresGeometriques> {
    abstract public double calculArea();
    public int compareTo(FiguresGeometriques f) {
        return Double.compare(this.calculArea(), f.calculArea());
    }
}


