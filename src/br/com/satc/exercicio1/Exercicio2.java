package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        System.out.println("Digite o número desejado : ");
        int n = entrada.nextInt();

        
        for (int i = 0; i > n; i++) {
            soma = soma + n;

        }
        System.out.println(soma);

    }
}
