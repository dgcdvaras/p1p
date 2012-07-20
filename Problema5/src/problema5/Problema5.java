/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int cantpreg,pregbue,porcent;
        System.out.print("Ingrese la cantidad de preguntas:");
        cantpreg=teclado.nextInt();
        System.out.print("Ingrese la cantidad de preguntas buenas:");
        pregbue=teclado.nextInt();
        porcent=pregbue*100/cantpreg;
        if (porcent>=90) {
            System.out.println("Nivel Maximo");
        } else {
            if (porcent>=75 && porcent<90) {
                System.out.println("Nivel Medio");
            } else {
                if (porcent>=50 && porcent<75) {
                    System.out.println("Nivel Regular");
                } else {
                    System.out.println("Fuera de Nivel");
                    
                }
                
            }
            
        }
            
                
        
    }
}
