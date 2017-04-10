
package br.com.satc.lista;

import java.util.Scanner;


public class exercicio1 {

 
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
      System.out.println("Qual o número? ");
      int N = entrada.nextInt();
      for (int i = 0; i <= N; i++) {
          System.out.println(i);       
        } 
    }
    
}
