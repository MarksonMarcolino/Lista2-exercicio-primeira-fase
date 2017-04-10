package br.com.satc.exercicio1;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float ana = (float) 1.50;
        float felis = (float) 1.10;
        int anos = 0;

        do {
            
            felis += 0.03;
            ana += 0.02;
            anos++;

        }while (ana > felis);

        System.out.println("Serão necessários"  +anos+ "para que Felisberto seja maior que Anacleto.");

    }
}
