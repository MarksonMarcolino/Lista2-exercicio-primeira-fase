package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 20; i++){
            System.out.println("Digite o número em polegadas : ");
            float P = entrada.nextFloat();
           double CM = P / 2.54;
            System.out.println(CM);
           
            
         }
    }
    
}
