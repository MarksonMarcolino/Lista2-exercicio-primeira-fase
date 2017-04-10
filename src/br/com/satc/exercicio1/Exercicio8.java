
package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio8 {

    /**
     * A conversão de graus Fahrenheit para centígrados e obtida pela fórmula C = 5/9 (F − 32). 
     * Escreva um algoritmo que calcule e escreva uma tabela de graus centígrados 
     * em função de graus Fahrenheit que
      variem de 50 a 150 de 1 em 1.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double c;
        System.out.println("Este programa converte graus Fahrenheit para Centígrado.");
        for (int i = 50; i <= 150; i++) {
            c=(1.8*i)+32;
            System.out.println("Fahrenheit: "+i+" Centígrado: "+c);
            
        }
        
        
    }
    
}
