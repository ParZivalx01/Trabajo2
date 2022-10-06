package Modelo;

import Vista.Vistagrafoed;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author JESUS MANUEL CORDERO
 */
public class Vertice {

    private int pos = -1;
    private Point punto;
    private String nombreVer[];

    public Vertice() {
        this.nombreVer = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    }

    public void dibujar(Vistagrafoed g) {
//        Font fuenteV = getFont();
//        Font nuevaFuente = new Font("Monospaced", Font.BOLD, 16);
//        g.setColor(Color.blue);
//        g.drawOval(0, 0, 30, 30);
//        g.setColor(Color.black);
//        g.setFont(nuevaFuente);
//        if (Vista.c == Vista.maxVer) {
//            Vista.c = 0;
//        }
//        g.drawString(Vista.nombreVer[Vista.c], 12, 19);
//        g.setFont(fuenteV);
//        this.setName(Vista.nombreVer[Vista.c]);
//        pos = Vista.c;
//        Vista.c++;
//    }

    }
}
