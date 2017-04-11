package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Vinimilanez
 */
public class exercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Deseja comverter de \n "
                + "1: ºC para ºF \n"
                + "2: ºF para ºC");
        int c = entrada.nextInt();
        switch (c) {
            case 1:
                System.out.println("Qual a temperatura em ºC.");
                double ce = entrada.nextDouble();
                double f = (ce * 1.8 + 32);
                System.out.println("A temperatura em ºF:" + f);
                break;
            case 2:
                System.out.println("Qual a temperatura em ºF.");
                f = entrada.nextDouble();
                ce = (f - 32) / 9;
                System.out.println("A temperatura em ºC:" + (ce * 5));
                break;
        }
    }

}
