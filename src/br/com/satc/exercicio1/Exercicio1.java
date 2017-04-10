package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Até qual número você quer chegar? ");
        int nmr = input.nextInt();
        
        for (int i = 1; i <= nmr; i++) {
            System.out.println(i);
            
        }
        
    }
    
}
