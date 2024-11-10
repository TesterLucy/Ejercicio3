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
public class HeapSort {
    public static void ordenarHeapSort(int[] arreglo, JLabel jLTiempoDuracion) {
        long startTime = System.nanoTime(); // Obtener el tiempo de inicio

        int n = arreglo.length;

        // Construir un montículo (heap)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arreglo, n, i);
        }

        // Extraer elementos uno por uno del montículo
        for (int i = n - 1; i > 0; i--) {
            // Mover la raíz actual al final del array
            int temp = arreglo[0];
            arreglo[0] = arreglo[i];
            arreglo[i] = temp;

            // Llamar al método heapify en el montículo reducido
            heapify(arreglo, i, 0);
        }

        long endTime = System.nanoTime(); // Obtener el tiempo de finalización
        long duration = endTime - startTime; // Calcular la duración en nanosegundos

        // Convertir la duración a milisegundos y actualizar el JLabel
        SwingUtilities.invokeLater(() -> {
            jLTiempoDuracion.setText("(HeapSort): " + String.format("%.3f μs", duration / 1_000.0));
        });
    }

    private static void heapify(int[] arreglo, int n, int i) {
        int mayor = i;
        int izquierda = 2 * i + 1;
        int derecha = 2 * i + 2;

        // Si el hijo izquierdo es más grande que la raíz
        if (izquierda < n && arreglo[izquierda] > arreglo[mayor]) {
            mayor = izquierda;
        }

        // Si el hijo derecho es más grande que la raíz
        if (derecha < n && arreglo[derecha] > arreglo[mayor]) {
            mayor = derecha;
        }

        // Si el mayor no es la raíz
        if (mayor != i) {
            int temp = arreglo[i];
            arreglo[i] = arreglo[mayor];
            arreglo[mayor] = temp;

            // Recursivamente heapify el subárbol afectado
            heapify(arreglo, n, mayor);
        }
    }
}
