/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float ana =  (float) 1.5;
        float felis = (float) 1.0;
        int ano = 0;
        do {            
           ana+=0.02;
           felis+=0.03;        
            ano++;
        } while (ana < felis);
            System.out.println("Os anos para felisberto ficar maior que Anacleto é de "+ano+".");
    }
    
}
