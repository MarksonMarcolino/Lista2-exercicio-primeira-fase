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
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int i,n,e=999999999,m=-999999999;
        for (i = 0; i <= 20; i++) {
           System.out.println("Digite o valor de N:");
           n = entrada.nextInt();
           if (n>m){
              m=n; 
           }
           if (n<e){
               e=n;
           }
        }
        System.out.println("O maior valor fornecido foi "+m+" e o menor foi "+e+".");
    }
    
}
