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
public class Main7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int i,b,e,r=0;
    System.out.println("Qual o expoente?");
    e = entrada.nextInt();
    System.out.println("Qual a base?");
    b = entrada.nextInt();
    if (e>=0);
        for (i = 0; i <= e; i++) {
           r=b*i;
        }
    if (e<0);
        for (i = 0; i >= e; i--) {
           r=b*i;
        }    
    System.out.println("O resultado da base elevado no expoente é :"+r+".");
    }
    
}
