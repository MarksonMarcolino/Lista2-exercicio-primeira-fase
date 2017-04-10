
package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *Faça um algoritmo que seja capaz de obter o resultado de uma exponenciação 
 * para qualquer base e expoente inteiro fornecidos, sem utilizar a operação de exponenciação
 * @author Edutec
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a base: ");
        int base=entrada.nextInt();
        System.out.print("Informe o expoente: ");
        int expoente=entrada.nextInt();
        if (expoente==0) {
            System.out.println("Resultado da exponenciação: "+"1");    
        }else {
            double exp=0;
        for (int i = 1; i <= expoente; i++) {
            exp = base*base;
    
        }
        System.out.println("Resultado da exponenciação: "+exp);
        }
        
    }
    
}
