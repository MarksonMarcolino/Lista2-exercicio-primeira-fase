
package src.br.com.satc;

import java.util.Scanner;

/**
 *
 * @author Vinimilanez
 */
public class exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n,soma= -32000,nmenor = 32000;
        
        for (int i=1; i<=20; i++){
            n=0; 
            System.out.println("Diga o "+i+"º numero.");
            n = entrada.nextInt();
            if (n<nmenor){nmenor=n;} else
                if (n>soma){soma=n;}               
        }
        System.out.println("O maior numero é: "+soma+" \n "
                + "E o menor numero é:"+nmenor+".");
    }
    
}
