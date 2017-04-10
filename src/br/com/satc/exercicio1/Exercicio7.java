package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        float resultado = 0;
        System.out.println("Digite o expoente: ");
            int e=entrada.nextInt();
            System.out.println("Digite a base: ");
            int base=entrada.nextInt();
        for (int i = 0; i < e; i++) {
             resultado = base*base;
            }
        System.out.println("Resultado:"+resultado+".");
    }
    
}
