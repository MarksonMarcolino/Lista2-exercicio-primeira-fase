/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, n = 0, numeromaior, numeromenor;
        Scanner entrada = new Scanner(System.in);
        numeromaior = -32000;
        numeromenor = 32000;
        for (i = 1; i <= 20; i++) {
            System.out.println("Qual o " + i + "º número?");
            n = entrada.nextInt();
        }

        if (n > numeromaior) {
            numeromaior = n;
        } else if (n < numeromenor) {
            numeromenor = n;
        }

        System.out.println("O maior valor digittado é: " + numeromenor + ".");

        System.out.println("O menor valor digitado é: " + numeromaior + ".");

    }

}
