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
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        float soma = 0;
        System.out.println("Insira um numero");
        int nu = input.nextInt();
        for (int j = 1; j <= nu; j++) {
            
           soma = soma + j;
        }
            System.out.println(soma);
    }
}
