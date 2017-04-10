
package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 * Faça um algoritmo que imprima todos os números inteiros de 1 a N (fornecido pelo usuário).
 * @author Markson
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro n: ");
        int n;
        n = entrada.nextInt();
        if (n>=0) {
            for (int i = 1; i <= n; i++) {
            System.out.println(i);
            
            
        }
            
        } else {
            System.out.println("Você  digitou um número negativo.");
        }
        
    }
    
}
