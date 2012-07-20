/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Ingrese el primer numero:");
        num1=teclado.nextInt();
        System.out.print("Ingrese el segundo numero:");
        num2=teclado.nextInt();
        System.out.print("Ingrese el tercer numero:");
        num3=teclado.nextInt();
        
        if (num1<10||num2<10||num3<10) {
            System.out.print("Alguno de los números es menor a diez");
    }
}
}

