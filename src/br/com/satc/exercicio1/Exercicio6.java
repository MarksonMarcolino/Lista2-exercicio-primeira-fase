package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float ana = (float) 1.50;
        float felis = (float) 1.10;
        int ano = 0;
        do {
            ana += 0.02;
            felis += 0.03;
            ano++;

        } while (ana > felis);
        System.out.println("O ano é " + ano);

    }
}
