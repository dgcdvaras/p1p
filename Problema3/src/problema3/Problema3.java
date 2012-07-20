/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n1,n2,n3;
        System.out.print("Ingrese el primer numero:");
        n1=teclado.nextInt();
        System.out.print("Ingrese el segundo numero:");
        n2=teclado.nextInt();
        System.out.print("Ingrese el tercer numero:");
        n3=teclado.nextInt();
        
        if ((n1>n2) && (n1>n3)) {
            System.out.println ("El mayor es: " + n1);
            if (n2>n3) {
                System.out.println ("El menor es: " + n3);
            } else {
                System.out.println ("El menor es: " + n2);
            }
        }
        if ((n2>n1) && (n2>n3)) {
            System.out.println ("El mayor es: " + n2);
            if (n1>n3) {
                System.out.println ("El menor es: " + n3);
            } else {
                System.out.println ("El menor es: " + n1);
            }
        }
        if ((n3>n1) && (n3>n2)) {
            System.out.println ("El mayor es: " + n3);
            if (n1>n2) {
                System.out.println ("El menor es: " + n2);
            } else {
                System.out.println ("El menor es: " + n1);
            }
        }
    }
    }

