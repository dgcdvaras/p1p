/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problema9;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Problema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int cantidad,valor,suma,f;
        cantidad=0;
        suma=0;
        for (f=1;f<=10;f++) {
            System.out.print("Ingrese el numero:");
            valor=teclado.nextInt();
            if (f>=6) {
                suma=suma+valor;
                
            }
        }
        System.out.print("La suma de los ultimos 5 numeros es:"+suma);
    }
}
