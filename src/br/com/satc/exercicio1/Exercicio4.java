/*
 4. Imprima uma tabela de conversão de polegadas para centímetros, de 1 a 20. Considere que Polegada = Centímetro * 2,54.
 */
package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        
        Scanner net =new Scanner (System.in);
        
        int valor = 0;
         double centimetro = 0;
        for(int i = 0; i <= 20 ; i++){
       
                centimetro = valor * 2.54;
                
                System.out.println("A conversão de polegadas para centímetros é :"+centimetro);
        
    }
    
}
}