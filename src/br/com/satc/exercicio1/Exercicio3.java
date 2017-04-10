package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nmenor = -30000 ;
        int nmaior = 30000 ;
        
        
        for (int i = 0; i < 20; i++) {
            
            System.out.println("Número : ");
            int num = entrada.nextInt();
            
            
            if (num > nmenor ){
                nmaior = num ;
                
            }
            if (num < nmaior){
                nmenor = num;
                
            
            }
           
            
        }
        System.out.println("O maior número é "+nmaior);
        System.out.println("O menor número é "+nmenor);
            }
    
}
