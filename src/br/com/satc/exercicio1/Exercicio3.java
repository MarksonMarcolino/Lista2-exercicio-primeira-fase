package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int maior=-32000;
        int menor=32000;
        
        for (int i = 1; i <= 20; i++) {
            System.out.println("Qual o "+i+"º número? ");
        int nmr = input.nextInt();
        
        if (nmr > maior){
            maior=nmr;
            
        }
        if (nmr < menor){
            menor=nmr;
        }
            System.out.println("O maior número é "+maior);
            System.out.println("O menor número é "+menor);
        
            
        }
    } 
}
