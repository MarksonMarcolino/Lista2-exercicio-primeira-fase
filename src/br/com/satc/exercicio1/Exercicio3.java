/*
 3. Escreva um algoritmo que leia um conjunto de 20 números inteiros e mostre qual foi o maior e o menor valor fornecido.
 */
package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner net =new Scanner(System.in);
        
        int maior = 99999,menor = -99999;
      
         for(int i = 0; i <= 5 ; i++){
             
              System.out.print("Digite o valor desejado :");
              int n = net.nextInt();
            
            if(menor < n){
                menor = n;
               }else if (maior > n){
                maior = n;
            }
        }
        System.out.println("O Menor valor é :"+menor);
        System.out.println("O Maior valor é :"+maior);
    }
    
}
