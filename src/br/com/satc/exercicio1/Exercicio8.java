package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        float C;
        for (int i = 50; i < 150; i++) {
            
            C =(float) ((1.8*i)+32);
            
            System.out.println("Graus em Fahrenheit: "+ i +" Graus centígrados: "+ C);
                      
            
        }

    }
    
}
