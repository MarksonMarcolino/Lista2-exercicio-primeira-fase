/*
 7. Faça um algoritmo que seja capaz de obter o resultado de uma exponenciação 
para qualquer base e expoente inteiro fornecidos, sem utilizar a operação de exponenciação.

 */
package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio7 {

    
    public static void main(String[] args) {
        
        Scanner net =new Scanner(System.in);
        
        System.out.println("Digite o valor da base :");
        int base = net.nextInt();
        
        System.out.println("Digite o valor do Expoente :");
        int expo = net.nextInt();
        
        int E = 1;
        
        for(int i =1 ;i <= expo ; i ++){
            
            E = E *base;
            System.out.println("O resultado da exponenciação é :"+E);
        }
            
    }
    
}
