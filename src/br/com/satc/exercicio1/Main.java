
package br.com.satc.exercicio1;

import java.util.Scanner;
/**
 *
 * @author Vicius Milanez
 */
public class Main {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Diga-me ate que numero.");
        int n = entrada.nextInt();
        for (int i=0; i<=n; i++ ){
            System.out.println(i+" ");
        }
        
    }
    
}
