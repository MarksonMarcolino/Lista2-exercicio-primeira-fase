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
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner entrada = new Scanner (System.in);
       int n, i, soma=0;
       System.out.println("Qual o valor de N?");
       n = entrada.nextInt();
       if(n>=0){
        for (i = 0; i <= n; i++) {
         soma= soma+i; 
        }
       }
       System.out.println(soma);
       if(n<0){ 
         System.out.println("Você digitou um número negativo.");
        }
    }
    
}
