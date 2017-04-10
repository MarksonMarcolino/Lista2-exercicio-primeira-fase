
package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Informe o numero:");
        int num = entrada.nextInt();
        int soma = 0;
        for (int i = 0; i <= num; i++) {
          soma=(soma+i);
            }
         System.out.println("Resultado:"+soma+".");
        
    }
    
}
