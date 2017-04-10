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
public class Main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada= new Scanner(System.in);
       int i;
       double c;
       double p=0;
        for (i = 0; i <= 20; i++) {
            p=i;
            c=(p/2.58);
            System.out.println("O valor em polegadas é "+p+", e o valor em centimetros é "+c+".");
        }
    }    
}
 