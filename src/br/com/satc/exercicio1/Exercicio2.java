/*
 2. Faça um algoritmo que leia um número N, some todos os números inteiros de 1 a N, e mostre o resultado obtido.
 */
package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio2 {

    
    public static void main(String[] args) {
        
        Scanner net = new Scanner(System.in);
        
         System.out.println("Digite a Quantidade de numeros que Deseja ver na Tela : ");
        int n = net.nextInt();
        
        double soma = 0;
        for(int i = 1 ; i <= n ; i++){
            
         soma = soma + i;
         
        }
          System.out.print( " \n"+ soma );   
           
       
    }
    
}
