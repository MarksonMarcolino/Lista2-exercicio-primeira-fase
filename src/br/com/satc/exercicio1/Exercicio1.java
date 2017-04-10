
package br.com.satc.exercicio1;

import java.util.Scanner;



public class Exercicio1 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um valor para N: ");
        int n = entrada.nextInt();
        
        for (int i = 0; i <= n ; i++ ) {
            System.out.println(" " + i);
        }
    
    }
    
}
