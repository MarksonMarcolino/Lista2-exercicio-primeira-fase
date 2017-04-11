package br.com.satc.exercicio1;
 
 import java.util.Scanner;
 
 public class Exercicio8 {

     public static void main(String[] args) {
         
        Scanner entrada = new Scanner (System.in);
        
          float cent;
          
          for (int i = 50; i <= 150; i++) {
              
              cent=(float) ((1.8*i)+32);
              System.out.println("~Graus Fahrenheit: "+i+" \n"+
                      "~Graus centígrados: "+cent);
     }
     
   }
 }
