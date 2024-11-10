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
public class Seleccion {
    public static void ordenarSeleccion(int[] arreglo, JLabel jLTiempoDuracion) {
        long startTime = System.nanoTime(); // Obtener el tiempo de inicio

        int n = arreglo.length;

        for (int i = 0; i < n-1; i++) {
            int indiceMinimo = i;

            for (int j = i+1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int temp = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = temp;
        }

        long endTime = System.nanoTime(); // Obtener el tiempo de finalización
        long duration = endTime - startTime; // Calcular la duración en nanosegundos

        // Convertir la duración a milisegundos y actualizar el JLabel
        SwingUtilities.invokeLater(() -> {
            jLTiempoDuracion.setText("(Selección): " + String.format("%.3f μs", duration / 1_000.0));
        });
    }
}
