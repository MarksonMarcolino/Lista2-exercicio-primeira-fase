
package br.com.satc.exercicio1;


import java.util.Scanner;

public class exercicio4 {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
        for (int i = 1; i <= 20; i++) {
            double polg;
            polg = (double)( i * 2.54);
            System.out.println("|"+i+" CM é "+polg+"Polegadas|");
                  
        }
  
    }
    
}
