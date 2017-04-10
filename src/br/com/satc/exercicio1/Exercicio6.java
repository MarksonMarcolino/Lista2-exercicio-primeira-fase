package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
      float juliano= (float) 1.50;
      float xanaina= (float) 1.10;
      int ano = 0;
      do{
          
          juliano+=0.02;
          
          xanaina+=0.03;
          ano++;        
      }while(juliano > xanaina);
        System.out.println("Os anos que o Felisberto passou o Anacleto foi "+ano);
    }
    
}
