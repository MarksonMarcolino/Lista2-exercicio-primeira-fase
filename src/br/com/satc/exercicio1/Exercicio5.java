/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.exercicio1;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int votoc = 0;
        int votonu = 0;
        int votob = 0;
        int voto1 = 0;
        int voto2 = 0;
        int voto3 = 0;
        int voto4 = 0;
        float perccada = 0;
        float percnulo = 0;
        float percbranco = 0;
        float perccd = 0;
        int voto;
        do {
            System.out.println("Insira qual o seu voto: (1,2,3,4 para candidatos, 5 para voto nulo e 6 para voto branco)"
                    + "(Digite 0 para sair)");
            voto = input.nextInt();

            if (voto == 1) {
                votoc++;
                voto1++;
            }
            if (voto == 2) {
                votoc++;
                voto2++;

            }
            if (voto == 3) {
                votoc++;
                voto3++;
            }
            if (voto == 4) {
                votoc++;
                voto4++;
            }
            if (voto == 5) {
                votonu++;
            }
            if (voto == 6) {
                votob++;
            }

        } while (voto != 0);        
        perccd = 100 / (votob + votoc + votonu);
        perccada = (votob + votoc + votonu);
        percnulo = (votonu * 100) / perccada;
        percbranco = (votob * 100) / perccada;
        double percentual1 = (voto1 * 100) / perccada;
        double percentual2 = (voto2 * 100) / perccada;
        double percentual3 = (voto3 * 100) / perccada;
        double percentual4 = (voto4 * 100) / perccada;
        System.out.println("Foram " + voto1 + " votos para o candidato 1, sendo " + percentual1 + "% dos votos");
        System.out.println(+voto2 + " votos para o candidato 2, sendo " + percentual2 + "% dos votos.");
        System.out.println(+voto3 + " votos para o candidato 3, sendo " + percentual3 + "% dos votos.");
        System.out.println(+voto4 + " votos para o candidato 4,sendo " + percentual4 + "% dos votos.");
        System.out.println("Foram " + votonu + " votos nulos equivalendo a " + percnulo + "% do total.");
        System.out.println("Foram " + votob + " votos brancos equivalendo a " + percbranco + "% do total.");
    }
}
