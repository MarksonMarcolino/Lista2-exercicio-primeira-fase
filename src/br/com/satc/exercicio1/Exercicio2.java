
package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("até que numero voce quer somar");
        int n = entrada.nextInt();
        int soma=0;
      
        for (int i = 0; i <=n; i++) {
         soma=soma+i;    
        }
        
        System.out.println(soma);
    }
    
}
