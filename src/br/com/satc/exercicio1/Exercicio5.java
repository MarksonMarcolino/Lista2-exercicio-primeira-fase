/*
 5. Em uma eleição presidencial existem quatro candidatos. Os votos são informados por código. Os dados utilizados para a escrutinagem obedecem à seguinte codificação:
* 1, 2, 3, 4 = voto para os respectivos candidatos;
* 5 = voto nulo;
* 6 = voto em branco.
Elabore um algoritmo que calcule e escreva:
* o total de votos para cada candidato e seu percentual sobre o total;
* o total de votos nulos e seu percentual sobre o total;
* o total de votos em branco e seu percentual sobre o total.
Como finalizador do conjunto de votos, tem-se o valor 0 (zero).

 */
package br.com.satc.exercicio1;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner net = new Scanner(System.in);

        int voto;
        int voto1 = 0;
        int voto2 = 0;
        int voto3 = 0;
        int voto4 = 0;
        int voto5 = 0;
        int voto6 = 0;

        do {
            System.out.println("Digite o numero do seu candidato a voto :");
            voto = net.nextInt();
            System.out.println("\n\n");

            switch (voto) {
                case 1: {
                    voto1++;
                    break;
                }
                case 2: {
                    voto2++;
                    break;
                }
                case 3: {
                    voto3++;
                    break;
                }
                case 4: {
                    voto4++;
                    break;
                }
                case 5: {
                    voto5++;
                    break;
                }
                case 6: {
                    voto6++;
                    break;
                }
                default: {
                    System.out.println("***Opção Invalida***");
                }

            }

        } while (voto != 0);

        int totalVotos = voto1 + voto2 + voto3 + voto4 + voto5 + voto6;

        System.out.println("A quantidade de votos das eleições são :" + totalVotos);

        double p = (voto1 * 100)/totalVotos;
        System.out.println("O percentual de votos para o candidato 1 são :" + p+"%");
        System.out.println("A quantidade de votos do candidato 1 são :" + voto1);
        System.out.println("\n\n");
        
        double l = (voto2 * 100)/totalVotos;
        System.out.println("O percentual de votos para o candidato 2 são :" + l+"%");
        System.out.println("A quantidade de votos do candidato 2 são :" + voto2);
        System.out.println("\n\n");
         
        double h =(voto3 * 100)/totalVotos;
        System.out.println("O percentual de votos para o candidato 3 são :" + h+"%");
        System.out.println("A quantidade de votos do candidato 3 são :" + voto3);
         System.out.println("\n\n");

        double o = (voto4 * 100)/totalVotos;
        System.out.println("O percentual de votos para o candidato 4 são :" + o+"%");
        System.out.println("A quantidade de votos do candidato 4 são :" + voto4);
        System.out.println("\n\n");

        double perNulo = (voto5 * 100)/totalVotos;
        System.out.println("O percentual de votos nulos são :" + perNulo+"%");
        System.out.println("A quantidade de votos nulos são :" + voto5);
         System.out.println("\n\n");

        double percBranco = (voto6 * 100)/totalVotos;;
        System.out.println("O percentual de votos em Branco são :" + percBranco+"%");
        System.out.println("A quantidade de votos em branco são :" + voto6);
         System.out.println("\n\n");
    }

}
