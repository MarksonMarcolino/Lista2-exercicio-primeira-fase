/*
 6. Anacleto tem 1,50 m e cresce 2 cm por ano, enquanto Felisberto tem 1,10 m e cresce 3 cm por ano. 
Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Felisberto seja
maior que Anacleto.

 */
package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
       
        Scanner net =new Scanner (System.in);
        
        double alt1 , alt2 ;
        double c = 0;
        
        alt1 = 1.50;
        alt2 = 1.1;
        
        while (alt1 > alt2) {            
            
            alt1= alt1 + 0.02;
            alt2 = alt2 + 0.03;
            c++;
        }
        System.out.println("Daqui,"+c+" anos Felisberto será maior que Anacleto");
        
        
    }
    
}
