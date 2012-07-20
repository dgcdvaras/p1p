/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problema8;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Problema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int cantidad,n,f,altura,base,superficie;
        cantidad=0;
        System.out.print("Cuantos pares de datos ingresara?");
        n=teclado.nextInt();
        for (f=1;f<=n;f++) {
            System.out.print("Ingrese la base del triangulo:");
            base=teclado.nextInt();
            System.out.print("Ingrese la altura del triangulo:");
            altura=teclado.nextInt();
            superficie=base*altura/2;
            System.out.println("Base:"+base);
            System.out.println("Altura:"+altura);
            System.out.println("Superficie:"+superficie);
            
            if (superficie>12) {
                cantidad=cantidad+1;
            }
        }
        System.out.println("La cantidad de triangulos cuya superficie es mayor a 12 es:"+cantidad);
        
    }
}
