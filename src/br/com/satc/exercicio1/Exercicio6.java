package br.com.satc.exercicio1;

public class Exercicio6 {

    public static void main(String[] args) {
        int medida1 = 150;
        int medida2 = 110;
        int vezes = 0;
        do {
            vezes++;
            medida1 += 2;
            medida2 += 3;
        }while(medida1 > medida2);
        System.out.println(vezes + " vezes.");
    }

}
