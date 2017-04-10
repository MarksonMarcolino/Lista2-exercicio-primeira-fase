/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.exercicio1;

/**
 *
 * @author Edutec
 */
public class Main8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int i;
    double c;
        for (i = 50; i <= 150; i++) {
         c= (1.8*i)+32;
         System.out.println("A temperatura em Fahrenheit é "+i+". E a mesma temperatura em Celsius é "+c+".");
        }
    }
    
}
