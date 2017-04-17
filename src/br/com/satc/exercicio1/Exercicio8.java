/*
 8. A conversão de graus Fahrenheit para centígrados e obtida pela fórmula C = 5/9 (F − 32).
Escreva um algoritmo que calcule e escreva uma tabela de graus centígrados em função de graus Fahrenheit que
variem de 50 a 150 de 1 em 1.

 */
package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio8 {

    
    public static void main(String[] args) {
       
        Scanner net = new Scanner(System.in);
       
        double C ;
        
        for (int i = 50; i <= 150 ;i++){
            
            C = (9 / 5 ) * (i - 32);
            
            System.out.println("A temperatura é"+C);
        }
    }
    
}
