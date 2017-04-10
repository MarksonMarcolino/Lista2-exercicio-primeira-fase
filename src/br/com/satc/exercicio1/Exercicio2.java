
package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio2 {

    /**
     * Faça um algoritmo que leia um número N, some todos os números inteiros de 1 a N, 
     * e mostre o resultado obtido.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite um número n inteiro: ");
        int n=entrada.nextInt();
        float soma=0;
        
        if (n>=0) {
            for (int i = 1; i <=n ; i++) {
            soma = soma+i;
        }
        System.out.print("Resultado da soma: "+soma);
            
        } else {
            System.out.print("Você digitou um número negativo.");
        }
        
    }
    
}
