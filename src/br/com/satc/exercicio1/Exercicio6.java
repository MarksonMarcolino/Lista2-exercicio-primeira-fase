package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float Ana = (float) 1.50;
        float Felis = (float) 1.10;
        
        int ano = 0;
              
        do{
            
            Ana+=0.02;
            Felis+=0.03;
            
            ano++;
            
           
        }while(Ana < Felis);
        
           System.out.println("Depois de "+ano+" Felisberto alcançará a altura de Ana");
        
    }
    
}
