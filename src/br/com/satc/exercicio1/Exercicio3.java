
package br.com.satc.exercicio1;

import java.util.Scanner;


public class Exercicio3 {

    /*. Escreva um algoritmo que leia um conjunto de 20 números inteiros e 
    mostre qual foi o maior e o menor valor fornecido.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menor= 35000;
        int maior=-35000; 
        System.out.println("Informe os 20 numero desejados:");
        for (int i = 0; i < 20; i++) {
            int N= entrada.nextInt();
            if (N>maior){
                maior=N;}
            if (N<menor){
                menor=N;}
        }
                System.out.println("O numero maior informado é = "+maior);
                System.out.println("O numero menor informado é = "+menor);
    }
    
}
