package guia32;

import java.util.Scanner;

public class tipos_String {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
   
        System.out.print("Ingrese el valor 1: ");
        int var1 = key.nextInt();
        
        System.out.print("Ingrese el valor 2: ");
        int var2 = key.nextInt();

        System.out.println("Valores ingresados:");
        System.out.println("Varlor 1 = " +var1);
        System.out.println("Varlor 2 = "+var2+"\n");
        
        int temp = var1;
        var1 = var2;
        var2 = temp;
        System.out.println("Después del intercambio:");
        System.out.println("Varlor 1 = " +var1);
        System.out.println("Varlor 2 = "+var2+"\n");
        
        key.close();
    }
}
