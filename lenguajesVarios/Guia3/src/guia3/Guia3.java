/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia3;
import java.util.Arrays;
import java.util.Scanner;

public class Guia3 {
    public static void main(String[] args) {
        String[] arregloNombres = new String[10];
        Scanner key = new Scanner(System.in);
        
        for (int i = 0; i < arregloNombres.length; i++) {
            System.out.print("Ingrese un nombre para la posición " + i + ": ");
            arregloNombres[i] = key.nextLine();
        }
        System.out.println("Arreglo de nombres ingresados: " + Arrays.toString(arregloNombres));
        key.close();
    }
}
