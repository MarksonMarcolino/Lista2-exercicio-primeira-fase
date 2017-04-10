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
public class exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 20; i++) {
        double soma = (i * 2.54);  
        System.out.println("O resultado da converção de cm para polegada (respectivamente de um a vinte) é de: "+soma+".");
        }
       
    }

}
