
package br.com.satc.exercicio1;

import java.util.Scanner;


public class Exercicio7 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Qual a base? ");
        int base = input.nextInt();
        System.out.println("Qual o expoente? ");
        int exp = input.nextInt();
        int resultado = base;
        
        for (int i = 0; i < exp; i++) {
            resultado =+ resultado*base;        
        }
        System.out.println("O resultado é: "+resultado);
    }
    
}

