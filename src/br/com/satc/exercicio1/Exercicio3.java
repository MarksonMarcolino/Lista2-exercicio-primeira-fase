
package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int n = input.nextInt();
     int maior=-32000;
     int menor=32000;
        
        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite o "+i+" numero: ");
        if (n>maior){
            maior=n;
            
        if (n<menor){
            maior=n;
        }    
        }
        }
        
        System.out.println("A menor é: "+menor);
        System.out.println("A maior é: "+maior);
    }
    
}
