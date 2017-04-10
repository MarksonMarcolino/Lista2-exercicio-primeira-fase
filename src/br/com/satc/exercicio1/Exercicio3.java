
package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int maior = -32000;
          int menor =32000;
        for (int i =1; i <= 20; i++) {
            System.out.println("Qual o "+i+"° numero voce quer?");
            int n =entrada.nextInt();
          if (n > maior){
              maior=n;
          }
          if (n<menor){
              menor=n;
          }
            System.out.println("O maior numero é "+maior);
            System.out.println("O menor numero é "+menor);
        }
 
    }
    
}
