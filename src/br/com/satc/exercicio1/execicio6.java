
package br.com.satc.exercicio1;
/**
 *
 * @author Vinimilanez
 */
public class execicio6 {
    public static void main(String[] args) {
    double felis=1.10;
    double ana=1.50;
    int i = 0;   
    do {
            i++;
            felis=(felis+0.03);
            ana=(ana+0.02);
        } while (felis<ana);
        
    System.out.println("Levara "+i+" anos.");
    }
    
}
