/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Main6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in); 
    int i=0;
    double a=1.50;
    double f=1.10;
    do{
      i=i+1;
      a=a+0.02;
      f=f+0.03;
    }while(f<a);
    System.out.println("O Felisberto será maior que o Anacleto depois de "+i+" anos.E tera uma altura de "+f+".");
    }
    
}
