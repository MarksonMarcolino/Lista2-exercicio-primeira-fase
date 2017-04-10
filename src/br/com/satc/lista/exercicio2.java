
package br.com.satc.lista;

import java.util.Scanner;


public class exercicio2 {

   
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Qual é o número?");
        int N = entrada.nextInt();
        int soma =0;
        for (int i = 0; i <= N; i++) {
            
            soma = (soma+i);    
        }
        System.out.println("O resultado é " + soma + ".");
    }
    
}
