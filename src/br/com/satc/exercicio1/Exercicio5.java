
package br.com.satc.exercicio1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *Em uma eleição presidencial existem quatro candidatos. Os votos são informados por código. 
 * Os dados utilizados para a escrutinagem obedecem à seguinte codificação:
* 1, 2, 3, 4 = voto para os respectivos candidatos;
* 5 = voto nulo;
* 6 = voto em branco.
Elabore um algoritmo que calcule e escreva:
* o total de votos para cada candidato e seu percentual sobre o total;
* o total de votos nulos e seu percentual sobre o total;
* o total de votos em branco e seu percentual sobre o total.
Como finalizador do conjunto de votos, tem-se o valor 0 (zero).

 * @author Edutec
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Este programa computa os votos e mostra os resultados de uma eleição:");
        System.out.println("Para finalizar a contagem digite 0.");
         int v=0;
         int cand1=0;
         int cand2=0;
         int cand3=0;
         int cand4=0;
         int nulo=0;
         int branco=0;
         
        do {
            System.out.print("Voto: ");
            v=entrada.nextInt();
           
            if (v==1) {
                v=0;
                v=v+1;
                cand1=cand1+v;   
            }
            if (v==2) {
                v=0;
                v=v+1;
                cand2=cand2+v;   
            }
            if (v==3) {
                v=0;
                v=v+1;
                cand3=cand3+v;   
            }
            if (v==4) {
                v=0;
                v=v+1;
                cand4=cand4+v;   
            }
            if (v==5) {
                v=0;
                v=v+1;
                nulo=nulo+v;   
            }
            if (v==6) {
                v=0;
                v=v+1;
                branco=branco+v;   
            }
            
        } while (v!=0);
        
        float total;
        total = cand1+cand2+cand3+cand4+nulo+branco;
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Votos do candidato um: "+cand1+", e o percentual sobre o total é de: "+df.format((cand1*100)/total)+"%");
        System.out.println("Votos do candidato dois: "+cand2+", e o percentual sobre o total é de: "+df.format((cand2*100)/total)+"%");
        System.out.println("Votos do candidato três: "+cand3+", e o percentual sobre o total é de: "+df.format((cand3*100)/total)+"%");
        System.out.println("Votos do candidato quatro: "+cand4+", e o percentual sobre o total é de: "+df.format((cand4*100)/total)+"%");
        System.out.println("Votos nulos: "+nulo+", e o percentual sobre o total é de: "+df.format((nulo*100)/total)+"%");
        System.out.println("Votos em branco: "+branco+", e o percentual sobre o total é de: "+df.format((branco*100)/total)+"%");
        
    }
    
}
