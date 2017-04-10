
package br.com.satc.lista;

import java.util.Scanner;


public class exercicio5 {

   
    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
        System.out.println("Candidato (1) Candidato(2) Candidato (3) Candidato (4)"
                + "Voto nulo (5)"
                + "Voto em branco (6)");
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int votonulo = 0;
        int votobranco = 0;
        int condicao = 0;
        
        do {
            System.out.println("Digite seu voto:");
            int voto = entrada.nextInt();
            if (voto ==1) {
                candidato1 = (candidato1 + 1);
            } else {
                if (voto ==2) {
                    candidato2= (candidato2 + 1);
                }else {
                    if (voto ==3) {
                        candidato3 = (candidato3 + 1);
                    }
                }
            }
        } while (condicao==1);
        float percentual;
        int total = (candidato1+candidato2+candidato3+candidato4+votonulo+votobranco);
        percentual= (100/total);
        System.out.println("candidato1:"+candidato1+" votos "+ (candidato1*percentual)+ "%");
        System.out.println("candidato2:"+candidato2+" votos "+ (candidato2*percentual)+ "%");
        System.out.println("candidato3:"+candidato1+" votos "+ (candidato3*percentual)+ "%");
        System.out.println("candidato4:"+candidato1+" votos "+ (candidato4*percentual)+ "%");
        
        float percentualnulos=100/total;
        System.out.println("Votos nulos:"+votonulo+" porcentagem:"+percentualnulos+".");
        float percentualbranco=100/total;
        System.out.println("Votos brancos:"+votobranco+"porcentagem:"+percentualbranco+".");
    }
    
}
