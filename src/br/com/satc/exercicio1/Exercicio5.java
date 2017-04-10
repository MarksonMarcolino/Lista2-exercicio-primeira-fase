
package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio5{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int vc = 0;
        int vN = 0;
        int votob = 0;
        int voto1 = 0;
        int voto2 = 0;
        int voto3 = 0;
        int voto4 = 0;
        double pc = 0;
        double pn = 0;
        double pb = 0;
        double pt = 0;
        int voto;
        do {
            System.out.println("qual o seu voto: (1,2,3,4= para candidatos, 5=voto nulo e 6 = voto branco)"
                    + "(Digite 0 para sair)");
            voto = input.nextInt();

            if (voto == 1) {
                vc++;
                voto1++;
            }
            if (voto == 2) {
                vc++;
                voto2++;

            }
            if (voto == 3) {
                vc++;
                voto3++;
            }
            if (voto == 4) {
                vc++;
                voto4++;
            }
            if (voto == 5) {
                vN++;
            }
            if (voto == 6) {
                votob++;
            }

        } while (voto != 0);        
        pt = 100 / (votob + vc + vN);
        pc = (votob + vc + vN);
        pn = (vN * 100) / pc;
        pb = (votob * 100) / pc;
        double p1 = (voto1 * 100) / pc;
        double p2 = (voto2 * 100) / pc;
        double p3 = (voto3 * 100) / pc;
        double p4 = (voto4 * 100) / pc;
        System.out.println("Foram " + voto1 + " votos para o candidato 1 " + p1 + "% dos votos");
        System.out.println("para o candidato 2 " + p2 + "% dos votos.");
        System.out.println(" para o candidato 3 " + p3 + "% dos votos.");
        System.out.println("para o candidato 4 " + p4 + "% dos votos.");
        System.out.println("votos nulos equivalendo a " + pn + "% do total.");
        System.out.println("votos brancos equivalendo a " + pb + "% do total.");
    }
}

