
package br.com.satc.exercicio1;

import java.util.Scanner;


public class Exercicio6 {

    /*6. Anacleto tem 1,50 m e cresce 2 cm por ano, 
    enquanto Felisberto tem 1,10 m e cresce 3 cm por ano. 
    Construa um algoritmo que calcule e imprima quantos anos serão necessários
    para que Felisberto seja maior que Anacleto.
     */
    public static void main(String[] args) {
        int med1 = 150;
        int med2 = 110;
        int V = 0;
        do {  
            V++;
            med1 += 2;
            med2 += 3;
        } while (med1 > med2);
        System.out.println("serão necessários " +V+ " anos." );       
        
    }
    
}
