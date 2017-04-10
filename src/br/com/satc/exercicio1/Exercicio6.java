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
public class Exercicio6 {
  public static void main(String[] args) {  
  Scanner entrada = new Scanner(System.in);
  float ana =  (float) 1.5;
  float felis = (float) 1.1;
  int anos =0;
  do{ 
 
      felis += 0.03;
      ana += 0.02;
      anos++;
  
  
  }while (felis < ana);
  System.out.println("Serão necessario "+anos+" anos Para Felisberto seja maior"
    + " que Anacleto " );
  
          
   }  
   
  
  }