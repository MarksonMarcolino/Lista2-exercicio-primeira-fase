/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int maior = 30000;
        int menor = -30000;        
        for (int i = 0; i < 20; i++) {
            
    Scanner entrada = new Scanner(System.in); 
    System.out.println("Número: ");
    int num = entrada.nextInt();
    
    if (num > menor ){
        maior = num ;
        
    }
        if (num < maior){
        menor = num ;
    }  
        }
        System.out.println("O maior número é "+maior);
        System.out.println("O menor número é "+menor);
                
            
}}
