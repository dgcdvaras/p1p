/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problema7;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Problema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numcuent;
        float saldo = 0,sumtot;
        sumtot=0;
        do {
            System.out.print("Ingrese el numero de cuenta(negativo para salir):");
            numcuent=teclado.nextInt();
            if (numcuent>=0) {
                System.out.print("Ingrese el saldo:");
                saldo=teclado.nextInt();
            }
                if (saldo>0) {    
                System.out.println(numcuent);
                System.out.println("Acreedor");
                sumtot=sumtot+saldo;
                } else {
                    if (saldo<0) {
                        System.out.println(numcuent);
                        System.out.println("Deudor");
                    } else {   
                        System.out.println(numcuent);
                        System.out.println("Nulo");
                        
                    }
                }    
                       
      
        } while (numcuent>=0);
        System.out.print("La suma total de los acreedores es:"+sumtot);
        
            }
        }