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
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Qual a base? ");
        int base = input.nextInt();
        
        System.out.println("Qual o expoente? ");
        int exp = input.nextInt();
        int resp = base;
        
        for (int i = 1; i <= exp; i++) {
            resp=+ resp*base;
     
        }
        System.out.println(base+" elevada á "+exp+" é igual a: "+ resp);
        
    }
    
}
