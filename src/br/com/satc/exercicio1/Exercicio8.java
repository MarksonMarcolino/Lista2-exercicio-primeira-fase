
package br.com.satc.exercicio1;

public class Exercicio8 {

    /*8. A conversão de graus Fahrenheit para centígrados e obtida pela fórmula
    C = 5/9 (F − 32). Escreva um algoritmo que calcule e escreva uma tabela de 
    graus centígrados em função de graus Fahrenheit que
variem de 50 a 150 de 1 em 1.
 */
    public static void main(String[] args) {
      System.out.println("Centigrados  -  Fahrenheit:");
       for (int i = 50; i <= 150; i++) {
           System.out.println("   "+i+"  =  "+((i*1.8)+32));
    }
   }   
}
