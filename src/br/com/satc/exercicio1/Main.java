
package br.com.satc.exercicio1;

import java.util.Scanner;


public class Main {

    /*1. Faça um algoritmo que imprima todos os 
números inteiros de 1 a N (fornecido pelo usuário).*/
    
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
        System.out.println("Informe até que numero deve ser informado:");
        int N = entrada.nextInt();
        for (int i = 0; i <= N; i++) {
            System.out.println(i);
        }
    }
    
}