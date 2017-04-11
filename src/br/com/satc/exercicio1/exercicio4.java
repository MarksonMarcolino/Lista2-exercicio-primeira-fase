package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Vinimilanez
 */
public class exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i;
        System.out.println("Centimetros | Polegadas");
        for (i = 1; i <= 20; i++)
        {
            double pole = 0;
            System.out.println(i + " | " + (i*2.54) + ".");
        }

    }

}
