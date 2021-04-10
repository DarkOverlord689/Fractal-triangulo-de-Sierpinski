
package fractalsierpinski;

import controladores.OyenteFractal2D;
import javax.swing.JFrame;
import modelos.Fractal2D;
import modelos.TrianguloSierpinski;
import vistas.PanelFractalSierpinski2D;

/**
 *
 * @author DarkOverlord689
 */
public class FractalSierpinski {

    public static void main(String[] args) {
        Fractal2D triangulo = new TrianguloSierpinski(100, 400, 400);     //MODELO
        PanelFractalSierpinski2D panel = new PanelFractalSierpinski2D(triangulo);           //VISTA
        OyenteFractal2D oyente = new OyenteFractal2D(triangulo, panel); //CONTROLADOR
        panel.addEventos(oyente);                                       //REGISTRO

        JFrame f = new JFrame("TRiangulo sierpinski");
        f.setSize(800, 600);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(panel);
        f.setVisible(true);

    }
}
