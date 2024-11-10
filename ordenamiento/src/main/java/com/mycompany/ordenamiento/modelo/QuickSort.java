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
public class QuickSort {
    public static void ordenarQuickSort(int[] arreglo, JLabel jLTiempoDuracion) {
        long startTime = System.nanoTime(); // Obtener el tiempo de inicio
        quickSort(arreglo, 0, arreglo.length - 1);
        long endTime = System.nanoTime(); // Obtener el tiempo de finalización
        long duration = endTime - startTime; // Calcular la duración en nanosegundos

        // Convertir la duración a milisegundos y actualizar el JLabel
        SwingUtilities.invokeLater(() -> {
            jLTiempoDuracion.setText("(QuickSort): " + String.format("%.3f μs", duration / 1_000.0));
        });
    }

    private static void quickSort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            // Obtener la posición del pivote después de particionar
            int indicePivote = particion(arreglo, inicio, fin);

            // Recursivamente ordenar los subarreglos antes y después del pivote
            quickSort(arreglo, inicio, indicePivote - 1);
            quickSort(arreglo, indicePivote + 1, fin);
        }
    }

    private static int particion(int[] arreglo, int inicio, int fin) {
        int pivote = arreglo[fin];
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (arreglo[j] <= pivote) {
                i++;

                // Intercambiar arreglo[i] y arreglo[j]
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }

        // Intercambiar arreglo[i+1] y arreglo[fin] (pivote)
        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[fin];
        arreglo[fin] = temp;

        return i + 1;
    }
}
