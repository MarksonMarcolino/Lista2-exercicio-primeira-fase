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
public class Exercicio7 {
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

  
   

