/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Problema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int sueldo,antig;
        double porc20,porc5;
        System.out.print("Ingrese el sueldo:");
        sueldo=teclado.nextInt();
        System.out.print("Ingrese la antiguedad en años:");
        antig=teclado.nextInt();
        porc20=0.2*sueldo;
        porc5=0.05*sueldo;
        if (sueldo<500 && antig>=10) {
            System.out.println("Se le otorgara un aumento de 20% y sera:"+(porc20+sueldo));
        } else {
            if (sueldo<500 && antig<10) {
              System.out.println("Se le otorgara un aumento de 5% y sera:"+(porc5+sueldo));
            } else {
                if (sueldo>=500) {
                System.out.println(sueldo);
            }
        }
    }
    }
}
