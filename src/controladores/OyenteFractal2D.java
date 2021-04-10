package controladores;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import modelos.Fractal2D;
import vistas.PanelFractalSierpinski2D;

/**
 *
 * @author DarkOverlord689
 */
public class OyenteFractal2D extends MouseAdapter {

    private final Fractal2D fractal2D;
    private final PanelFractalSierpinski2D panel;

    public OyenteFractal2D(Fractal2D fractal2D, PanelFractalSierpinski2D panel) {
        this.fractal2D = fractal2D;
        this.panel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            fractal2D.incrementarNivel();
        } else {
            fractal2D.decrementarNivel();
        }

        panel.repaint();
    }
}
