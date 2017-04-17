
package br.com.satc.exercicio1;

import java.util.Scanner;


public class Exercicio2 {

    /*2. Faça um algoritmo que leia um número N, some todos os números inteiros 
    de 1 a N, e mostre o resultado obtido.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um numero inteiro;");
        int N = entrada.nextInt();
        int soma = 0;
        for (int i = 0; i <= N; i++){
            soma = (soma+i);
        } System.out.println("Resultado =" +soma);
        
      
    }
    
}
