/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *Anacleto tem 1,50 m e cresce 2 cm por ano, enquanto Felisberto tem 1,10 m e cresce 3 cm por ano. 
 * Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Felisberto seja
maior que Anacleto.

 * @author Edutec
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double anacleto = 1.50;
        double felisberto = 1.10;
        int anos=0;
        do {
            anacleto=anacleto+0.02;
            felisberto=felisberto+0.03;
            anos=anos+1;
            
        } while (felisberto<anacleto);
        System.out.println("Anos para Felisberto ser maior que Anacleto: "+anos);
    }
    
}
