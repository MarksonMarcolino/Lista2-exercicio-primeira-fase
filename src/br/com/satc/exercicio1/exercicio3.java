package br.com.satc.exercicio1;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maior = 30000;
        int menor = -30000;

        for (int i = 0; i <= 20; i++) {
            System.out.println("Digite um número: ");
            int n = entrada.nextInt();

            if (n > menor) {
                maior = n;
                
            } 
            if (n < maior) {
                    menor = n;
                      
                }
         
            }
        System.out.println("O menor número é " + menor);
        System.out.println("O maior número é " + maior);  
    }
    
            
}

