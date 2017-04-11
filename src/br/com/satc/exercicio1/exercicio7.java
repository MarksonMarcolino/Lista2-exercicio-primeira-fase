package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Vinimilanez
 */
public class exercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o expoente?");
        int e = entrada.nextInt();
        System.out.println("Qual o qual a base?");
        double b = entrada.nextInt();
        e=(e-2);
        double soma = b;
        for (int i = 0; i <= e; i++) {
            soma = (soma * b);

        }
        System.out.println("O resultado é " + soma + ".");
    }

}
