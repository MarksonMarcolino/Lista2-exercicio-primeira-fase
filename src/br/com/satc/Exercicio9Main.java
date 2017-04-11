/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

/**
 *
 * @author Vinimilanez
 */
public class Exercicio9Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ºC | ºF");
        for (int i = 1; i < 151; i++) {
           double c=i;
           double f; 
            f = (c * 1.8 + 32); 
            System.out.println(c+"|"+f+".");
        }
    }
    
}
