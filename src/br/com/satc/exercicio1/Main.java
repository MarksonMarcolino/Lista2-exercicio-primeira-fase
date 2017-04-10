
package br.com.satc.exercicio1;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner (System.in);
     int i,n;
     System.out.println("Qual o valor de N?");
     n = entrada.nextInt();
     if(n>=0){
        for (i = 0; i <= n; i++) {
         System.out.println(i);
        }
       }
       if(n<0){
        for (i = 0; i >= n; i--) {
        System.out.println(i);
        }
       }
        }
    }
    

