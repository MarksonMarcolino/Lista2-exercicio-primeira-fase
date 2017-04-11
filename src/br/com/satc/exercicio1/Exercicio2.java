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
        Scanner input = new Scanner(System.in);
        
        System.out.println("Até que número que você quer somar? ");
        int nmr = input.nextInt();
        
        int soma=0;
        
        for (int i = 1; i <= nmr; i++) {
            soma = soma + i;
        }
         System.out.println(soma);
        

    }
    
}
