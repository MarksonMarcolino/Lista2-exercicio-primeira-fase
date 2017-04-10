
package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Markson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número desejado : ");
        int n = entrada.nextInt() ;
        for(int x = 1; x<n;x++){
            System.out.println(" "+x);
        }
        
    }
    
}
