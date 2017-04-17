package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio2 {

        public static void main(String[] args) {
            Scanner entrada = new Scanner (System.in);
            System.out.println("Escolha um número que será o liite de uma soma: ");
            int N = entrada.nextInt();
            int soma = 0;
            for (int i = 0; i <= N; i++) {
                
                soma = (soma + i);
            }
            System.out.println("O resultado é " + soma + ".");
    }
    
}
