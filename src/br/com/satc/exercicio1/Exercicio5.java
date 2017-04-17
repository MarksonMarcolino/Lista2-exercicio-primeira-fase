
package br.com.satc.exercicio1;

/**
 *
 * @author Edutec
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c1=0;
        int c2=0;
        int c3=0;
        int c4=0;
        int c5=0;
        int c6=0;
        float resp;
        
        
        System.out.println("Em quem deseja votar? -candidato 1;"
                                               + "-candidato 2;"
                                               + "-candidato 3;"
                                               + "-candidato 4;"
                                               + "-nulo 5;"
                                               + "-branco 6.");
       int v  = entrada.nextInt();
        
        
        switch (v) {
                case 1:
                 c1=c1+1;
                 break;
                case 2:
                 c2=c2+1;
                 break;       
                case 3:
                 c3=c3+1;
                  break;
                case 4:
                 c4=c4+1;
                  break;
                case 5:
                 c5=c5+1;
                  break;
                case 6:
                 c6=c6+1;
                 break;
        } 
        
        
       resp=c1+c2+c3+c4+c5+c6/100;  
       
                 
                 
                    
                    
                
                    
    }
    
    }
    
