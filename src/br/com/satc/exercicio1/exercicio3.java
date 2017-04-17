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
public class exercicio3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int maior = -99999;
        int menor = 99999;
        for (int i = 0; i < 20; i++) {
            System.out.println("Insira um numero: ");
            int nu = input.nextInt();

            if (maior > nu) {
                maior = nu;
            }

            if (menor < nu) {
                menor = nu;
            }
            System.out.println("O maior numero é: " + menor + " e o menor numero é: " + menor + ".");
        }
    }

}
