
package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Qual a base? ");
        int base = entrada.nextInt();
        System.out.println("Qual o expoente? ");
        int exp = entrada.nextInt();
        int soma=base;
        
        for (int i = 1; i <= exp; i++) {
     
            soma=+soma*base;
           
        }
        
        System.out.println("A conta deu :"+soma );
   }
    
}