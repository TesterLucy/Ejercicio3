/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenamiento;

/**
 *
 * @author FullCrock
 */
public class Ordenamiento {

    public static void main(String[] args) {
        // Generar números aleatorios
        String arregloGenerado = generarArreglo();
        
        // Imprimir el arreglo generado
        System.out.println("Arreglo generado: " + arregloGenerado);
    }

    public static String generarArreglo() {
        // Lógica para generar el arreglo de números aleatorios
        StringBuilder arreglo = new StringBuilder();
        for (int i = 0; i < 5; i++) {  // Generar 5 números aleatorios como ejemplo
            int numeroAleatorio = (int) (Math.random() * 100);  // Números aleatorios entre 0 y 99
            arreglo.append(numeroAleatorio).append(" ");
        }
        return arreglo.toString().trim();  // Eliminar el espacio final y devolver la cadena
    }
}
