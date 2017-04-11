
package br.com.satc.lista;

import java.util.Scanner;


public class exercicio3 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Este pograma lê os 20 inteiros e indica qual o maior e menor ");
        int maior = -32000;
        int menor = 32000;
        for (int i = 0; i <= 20; i++) {
            System.out.println("Digite um número: ");
            int num = entrada.nextInt();
             if (num>maior) {
                 maior=num;
             }
             if (num<menor) {
                 menor=num;
             }    
             
        }
     System.out.println("Maior número: "+maior+".");
     System.out.println("Menor número: "+menor+".");
    }
                 
}
