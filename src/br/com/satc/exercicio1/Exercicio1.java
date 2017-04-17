/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Markson
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o número N ? ");
        n=entrada. nextInt();
        for ( i=1;i<=n; i++){
            System.out.println(i);    
        }
        
        
    }
    
}
