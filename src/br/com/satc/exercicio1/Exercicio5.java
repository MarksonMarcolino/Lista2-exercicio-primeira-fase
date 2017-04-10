package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nT = 0;
        
        int nN = 0;
        
        int nB = 0;
        
        int n1 = 0;
        
        int n2 = 0;
        
        int n3 = 0;
        
        int n4 = 0;
        
        float pcada = 0;
        
        float pnulo = 0;
        
        float pbranco = 0;
        
        float pcd = 0;
        
        int voto;
        do {
            System.out.println("Votação: \n"
                    + "(1) Candidato1 \n"
                    + "(2) Candidato2 \n"
                    + "(3) Candidato3 \n"
                    + "(4) Candidato4 \n"
                    + "(5) Voto nulo \n"
                    + "(6) Voto em branco");
            
            voto = input.nextInt();

            if (voto == 1) {
                nT++;
                n1++;
            }
            if (voto == 2) {
                nT++;
                n2++;

            }
            if (voto == 3) {
                nT++;
                n3++;
            }
            if (voto == 4) {
                nT++;
                n4++;
            }
            if (voto == 5) {
                nN++;
            }
            if (voto == 6) {
                nB++;
            }

        } while (voto != 0);        
        pcd = 100 / (nB + nT + nN);
        pcada = (nB + nT + nN);
        pnulo = (nN * 100) / pcada;
        pbranco = (nB * 100) / pcada;
        
        float p1 = (float) ((n1 * 100) / pcada);
        
        float p2 = (float) ((n2 * 100) / pcada);
        
        float p3 = (float) ((n3 * 100) / pcada);
        
        float p4 = (float) ((n4 * 100) / pcada);
        
        System.out.println(n1 + " votos para o candidato1, sendo " + p1 + "% de todos os votos.");
        System.out.println(n2 + " votos para o candidato2, sendo " + p2 + "% de todos os votos.");
        System.out.println(n3 + " votos para o candidato3, sendo " + p3 + "% de todos os votos.");
        System.out.println(n4 + " votos para o candidato4,sendo " + p4 + "% de todos os votos.");
        System.out.println(nN + " votos nulos sendo " + pnulo + "% de todos os votos.");
        System.out.println(nB + " votos brancos sendo " + pbranco + "% de todos os votos.");
    }
}

