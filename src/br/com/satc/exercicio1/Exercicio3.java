/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *
 * Escreva um algoritmo que leia um conjunto de 20 números inteiros 
 * e mostre qual foi o maior e o menor valor fornecido.
 * @author Edutec
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int maior=0;
        int menor=999999999;
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o "+i+"º número:");
            int n=entrada.nextInt();
            
            if (n>maior) {
                maior = n;  
            }
            
            if (n<menor) {
                menor = n;
                
            }
   
        }
        System.out.println("O maior número é: "+maior);
            System.out.println("O menor número é: "+menor);
        
    }
    
}
