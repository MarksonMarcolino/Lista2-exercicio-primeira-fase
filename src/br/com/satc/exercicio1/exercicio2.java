package src.br.com.satc;

import java.util.Scanner;

/**
 *
 * @author Vinimilanez
 */
public class exercicio2 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Diga-me ate que numero."); 
        int soma = 0; 
        int n = entrada.nextInt();
        for (int i=0; i<=n; i++ ){
            soma=(soma+i);
        }
        System.out.println(soma+".");
    }
    
}
