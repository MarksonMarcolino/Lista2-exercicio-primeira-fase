package br.com.satc.exercicio1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        NumberFormat format = new DecimalFormat("0.00");       
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a base: ");
        int base = entrada.nextInt();
        System.out.println("Qual o expoente: ");
        int exp = entrada.nextInt();
        int result = 0;
        for (int i = 1; i <= exp; i++) {
            result += base * base;

        }
        System.out.println("A resposta é " + result);

    }

}
