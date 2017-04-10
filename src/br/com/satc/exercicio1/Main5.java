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
public class Main5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada= new Scanner(System.in);
     int c,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,ex,q,w,e,r,t,y;
     do{
         System.out.println("Você vota em quem?(Candidatos: 1,2,3,4. Nulo: 5. Branco: 6.)");
        c = entrada.nextInt();
       if (c==1){
         n1++;
       }
        if (c==2){
         n2++;
       }
         if (c==3){
         n3++;
       }
          if (c==4){
         n4++;
       }
           if (c==5){
         n5++;
       }
            if (c==6){
         n6++;
       }
         System.out.println("Caso a votação esteja encerrada digite o número '0'.");
         ex = entrada.nextInt();
     }while(!(ex==0));
     System.out.println("Os votos do candidato um é "+n1+" e o percentual do mesmo é "+(n1*100)/(n1+n2+n3+n4+n5+n6));
     System.out.println("Os votos do candidato dois é "+n2+" e o percentual do mesmo é "+(n2*100)/(n1+n2+n3+n4+n5+n6));
     System.out.println("Os votos do candidato três é "+n3+" e o percentual do mesmo é "+(n3*100)/(n1+n2+n3+n4+n5+n6));
     System.out.println("Os votos do candidato quatro é "+n4+" e o percentual do mesmo é "+(n4*100)/(n1+n2+n3+n4+n5+n6));
     System.out.println("Os votos do candidato cinco é "+n5+" e o percentual do mesmo é "+(n5*100)/(n1+n2+n3+n4+n5+n6));
     System.out.println("Os votos do candidato seis é "+n6+" e o percentual do mesmo é "+(n6*100)/(n1+n2+n3+n4+n5+n6));
     }
    
}
