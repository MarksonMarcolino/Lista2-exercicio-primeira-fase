
package br.com.satc.exercicio1;

import java.util.Scanner;


public class exercicio8 {

   
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
    
    double celsius;
     int fahr;
	for(fahr = 50; fahr <= 150; fahr ++){
	celsius = (5.0 /9 * (fahr-32));
        
        System.out.println("Valor de Fahrenheit: \n"+ fahr + celsius);
	}	
	
    }
    
}
