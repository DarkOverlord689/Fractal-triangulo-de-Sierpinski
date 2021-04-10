package modelos;

import java.awt.geom.Point2D;

/**
 *
 * @author DarkOverlord689
 */
public abstract class Fractal2D extends Point2D.Double implements Dibujable {

    protected int nivel;
    protected double largo;

    public Fractal2D(double x, double y, double largo) {
        super(x, y);
        this.largo = largo;
    }

    public void incrementarNivel() {
        nivel++;
    }

    public void decrementarNivel() {
        nivel--;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the largo
     */
    public double getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(double largo) {
        this.largo = largo;
    }
}
