
package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio4 {

    /**
     * Imprima uma tabela de conversão de polegadas para centímetros, 
     * de 1 a 20. Considere que Polegada = Centímetro * 2,54.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tabela de conversão de polegadas para centímetros:");
        double cent;
        System.out.println("Polegada/Centímetro"+"\n");
        
        for (int i = 1; i <= 20; i++) {
        cent=i/2.54;
            System.out.println("Polegada: "+i+" Centímetro: "+cent);

            
            
        }
    }
    
}
