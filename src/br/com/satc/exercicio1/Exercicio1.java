
package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Escolha um numero ?");
        int n=entrada.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i);  
        }
  
    }
    
}
