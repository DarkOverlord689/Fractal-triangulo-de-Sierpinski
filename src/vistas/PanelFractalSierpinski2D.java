package vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;
import modelos.Fractal2D;

/**
 *
 * @author DarkOverlord689
 */
public class PanelFractalSierpinski2D extends JPanel {

    private final Fractal2D fractal2D;

    public PanelFractalSierpinski2D(Fractal2D fractal2D) {
        this.fractal2D = fractal2D;
        this.setBackground(new java.awt.Color(153, 255, 204));
    }

    public void addEventos(MouseAdapter oyente) {
        this.addMouseListener(oyente);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 18));

        g.drawString("Nivel: " + fractal2D.getNivel(), 650, 50);
        g.setColor(Color.BLUE);
        fractal2D.dibujar(g);

    }

}
