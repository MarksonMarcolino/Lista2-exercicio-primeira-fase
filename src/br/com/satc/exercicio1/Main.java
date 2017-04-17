/*
 1. Faça um algoritmo que imprima todos os números inteiros de 1 a N (fornecido pelo usuário)
 */
package br.com.satc.exercicio1;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
      
        Scanner net = new Scanner (System.in);
        
        System.out.println("Digite a Quantidade de numeros que Deseja ver na Tela : ");
        int n = net.nextInt();
        
        for(int i = 1 ; i <= n ; i++){
            
            System.out.print(" "+ i + " " );
        }
    }
    
}
