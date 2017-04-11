package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o valor de 'n': ");
        int n = entrada.nextInt();
        double soma = 0;
        for (int i = 0; i <= n; i++) {
            soma = soma + i;

        }
        System.out.println("A soma de todos os números é: " + soma);
    }

}
