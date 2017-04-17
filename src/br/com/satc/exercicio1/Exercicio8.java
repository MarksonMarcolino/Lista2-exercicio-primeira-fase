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
public class Exercicio8 {
    //F=1,8C+32 
    //(f-32)/1,8

   
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     for (int i = 50; i <= 150; i++) {
         double temp;
         temp = ((i-32)/1.8);
         System.out.println(i+ " Fahrenheit é " + temp +" Celsius ");
    }
        }
}
    

