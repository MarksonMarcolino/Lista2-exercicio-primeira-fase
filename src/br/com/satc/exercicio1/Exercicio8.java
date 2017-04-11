package br.com.satc.exercicio1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        NumberFormat format = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);
        float C = entrada.nextInt();
        C = 0;
        for (int i = 50; i <= 150; i++) {
            C = (float) ((i - 32) / 1.8);
            System.out.println("A conversão de " + i + "F para C é " + format.format(C));

        }

    }

}
