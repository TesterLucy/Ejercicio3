
package com.mycompany.ordenamiento.modelo;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Shell {
    public static void ordenarShell(int[] arreglo, JLabel jLTiempoDuracion) {
        long startTime = System.nanoTime(); // Obtener el tiempo de inicio

        int n = arreglo.length;

        for (int brecha = n/2; brecha > 0; brecha /= 2) {
            for (int i = brecha; i < n; i++) {
                int temp = arreglo[i];
                int j;
                for (j = i; j >= brecha && arreglo[j - brecha] > temp; j -= brecha) {
                    arreglo[j] = arreglo[j - brecha];
                }
                arreglo[j] = temp;
            }
        }

        long endTime = System.nanoTime(); // Obtener el tiempo de finalización
        long duration = endTime - startTime; // Calcular la duración en nanosegundos

        // Convertir la duración a milisegundos y actualizar el JLabel
        SwingUtilities.invokeLater(() -> {
            jLTiempoDuracion.setText("(ShellSort): " + String.format("%.3f μs", duration / 1_000.0));
        });
    }
}
