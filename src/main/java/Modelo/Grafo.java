/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Point;

/**
 *
 * @author JESUS MANUEL CORDERO
 */
public class Grafo {
    
    private Point punto;
    private boolean Ver = false;
    private boolean Aris = false;

    private String nombreVer[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    private String nombreAris[] = {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10",
        "A11", "A12", "A13", "A14", "A15", "A16", "A17", "A18", "A19", "A20"};

    private int maxVer = 10;
    private int maxAris = nombreAris.length;

    private static int i = -1, j = -1;    
    private boolean MAdyacencia[][] = new boolean[maxVer][maxVer];
    private boolean MIncidencia[][] = new boolean[maxVer][maxAris];

    private String matrizAdyacente = "", matrizIncedencia = "";

    
    
    public void inicializar() {
        for (int r = 0; r < maxVer; r++) {
            for (int s = 0; s < maxVer; s++) {
                MAdyacencia[r][s] = false;
            }
        }
        for (int e = 0; e < maxVer; e++) {
            for (int f = 0; f < maxAris; f++) {
                MIncidencia[e][f] = false;
            }
        }
    }
    
  
}
