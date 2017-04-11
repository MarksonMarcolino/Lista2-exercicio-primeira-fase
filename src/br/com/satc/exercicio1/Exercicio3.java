package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maiorn = 30000;
        int menorn = -30000;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Escreva o " + i + " número.");
            int n = entrada.nextInt();
            if (n > menorn) {
                maiorn = n;
            }
            if (n < maiorn) {
                menorn = n;
            }

        }
        System.out.println("O maior número digitado é: " + maiorn);
        System.out.println("O menor número digitado é: " + menorn);

    }

}
