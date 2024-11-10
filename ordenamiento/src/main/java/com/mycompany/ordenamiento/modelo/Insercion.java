/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenamiento.modelo;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author FullCrock
 */
public class Insercion {
    public static void ordenarInsercion(int[] arreglo, JLabel jLTiempoDuracion) {
        long startTime = System.nanoTime(); // Obtener el tiempo de inicio

        int n = arreglo.length;
        for (int i = 1; i < n; ++i) {
            int clave = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j] > clave) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = clave;
        }

        long endTime = System.nanoTime(); // Obtener el tiempo de finalización
        long duration = endTime - startTime; // Calcular la duración en nanosegundos

        // Convertir la duración a milisegundos y actualizar el JLabel
        SwingUtilities.invokeLater(() -> {
            jLTiempoDuracion.setText("(Inserción): " + String.format("%.3f μs", duration / 1_000.0));
        });
    }
}
