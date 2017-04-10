package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Candidato(1)  Candidato(2)   Candidato(3)   Candidato(4)"
                + "  Voto nulo(5)"
                + "  Voto em branco(6)");
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int votonulo = 0;
        int votobranco = 0;
        int condicao;

        do {
            System.out.println("Digite o seu voto:");
            int voto = entrada.nextInt();
            if (voto == 1) {
                candidato1 = (candidato1 + 1);
            } else {
                if (voto == 2) {
                    candidato2 = (candidato2 + 1);
                } else {
                    if (voto == 3) {
                        candidato3 = (candidato3 + 1);
                    } else {
                        if (voto == 4) {
                            candidato4 = (candidato4 + 1);
                        } else {
                            if (voto == 5) {
                                votonulo = votonulo + 1;
                            } else {
                                if (voto == 6) {
                                    votobranco = votobranco + 1;
                                }
                            }

                        }
                    }
                }

            }
            
            System.out.println("informar um novo voto: (1)Sim   (0)Não");
              condicao= entrada.nextInt();
        } while (condicao== 1);
        float percentual;
        int total=(candidato1+candidato2+candidato3+candidato4+votobranco+votonulo);
        percentual=(100/total);
        System.out.println("Candidato1:"+candidato1+" Votos  "+(candidato1*percentual)+"%");
        System.out.println("Candidato2:"+candidato2+" Votos. "+(candidato2*percentual)+"%");
        System.out.println("Candidato3:"+candidato3+" Votos. "+(candidato3*percentual)+"%");
        System.out.println("Candidato4:"+candidato4+" Votos. "+(candidato4*percentual)+"%");
        
        float percentualnulos=100/total;
        System.out.println("Votos nulos:"+votonulo+" porcentagem:"+percentualnulos+".");
        float percentualbranco=100/total;
        System.out.println("Votos brancos:"+votobranco+" porcentagem:"+percentualbranco+".");
        
        
        
        

    }

}
