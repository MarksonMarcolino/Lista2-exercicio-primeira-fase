package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio3 {

        public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
            System.out.println("Este programa imprime os 20 números fornecidos pelo cliente e indica qual o menor e qual o maior");
            int menor = 32000;
            int maior= -32000;
            for (int i = 0; i < 20; i++) {
                System.out.println("Digite um número: ");
                int num = entrada.nextInt();
                if (num > maior) {
                    maior = num;
                }
                    if (num < menor) {
                        menor = num;
                    }
                }
            System.out.println("Maior número: " + maior + ".");
            System.out.println("Menor número: " + menor + ".");
            }
        }
    

