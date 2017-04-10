
package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
         float c;
         for (int i = 50; i <= 150; i++) {
             c=(float) ((1.8*i)+32);
             System.out.println("Fahrenheit: "+i+" Centígrado: "+c);
    }
    
}
}
