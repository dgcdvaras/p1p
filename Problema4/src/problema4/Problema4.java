/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int valor;
        System.out.print("Ingrese el numero:");
        valor=teclado.nextInt();
        if (valor>=1000) {
            System.out.print("ERROR!El numero tiene mas de 3 cifras");
        } else {
            if (valor>=100) {
            System.out.print("Tiene 3 digitos");
            } else {
                if (valor>=10) {
                    System.out.print("Tiene 2 digitos");
                } else {
                    System.out.print("Tiene 1 digito");
                }
            }    
            
        }
    }
}
