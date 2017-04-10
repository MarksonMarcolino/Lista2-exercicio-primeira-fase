package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //4. Imprima uma tabela de conversão de polegadas para centímetros, de 1 a 20. Considere que Polegada = Centímetro * 2,54.

        for (int i = 1; i <= 20; i++) {
            double polg;
            polg = (double) (i * 2.54);
            System.out.println(i + " centímetro é " + polg + " polegadas.");
        }
    }

}
