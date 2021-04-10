package modelos;

import java.awt.Graphics;

/**
 *
 * @author DarkOverlord689
 */
public class TrianguloSierpinski extends Fractal2D {

    public TrianguloSierpinski(int x, int y, int largo) {
        super(x, y, largo);
    }

    @Override
    public void dibujar(Graphics g) {
        dibujarTriangulo(g, x, y, largo, nivel);
    }

    public void dibujarTriangulo(Graphics g, double x, double y, double l, int n) {
        double angulo = Math.PI / 3;
        if (n == 0) {
            int[] cX = {(int) x, (int) (x + l), (int) (x + l * Math.cos(angulo))};
            int[] cY = {(int) y, (int) y, (int) (y - l * Math.sin(angulo))};
            g.fillPolygon(cX, cY, 3);
        } else {
            l = l / 2;
            n--;
            double[] vX = {x, x + l, x + l * Math.cos(angulo)};
            double[] vY = {y, y, y - l * Math.sin(angulo)};
            for (int i = 0; i < 3; ++i) {
                dibujarTriangulo(g, vX[i], vY[i], l, n);
            }
        }

    }
}
