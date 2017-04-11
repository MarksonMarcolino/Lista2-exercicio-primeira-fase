package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Vinimilanez
 */
public class exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double voto1 = 0;
        double voto2 = 0;
        double voto3 = 0;
        double voto4 = 0;
        double voton = 0;
        double votob = 0;
        char voto;
        do {

            System.out.println("Para votar no primeiro cadidato, digite '1';\n"
                    + "Para votar no primeiro cadidato, digite '2';\n"
                    + "Para votar no primeiro cadidato, digite '3';\n"
                    + "Para votar no primeiro cadidato, digite '4';\n"
                    + "Para votar nulo, digite '5';\n"
                    + "Para votar em branco, digite '6';\n"
                    + "Para sair, digite '0'.");
            voto = entrada.next().charAt(0);

            switch (voto) {
                case '1':
                    voto1 = +1;
                    break;
                case '2':
                    voto2 = +1;
                    break;
                case '3':
                    voto3 = +1;
                    break;
                case '4':
                    voto4 = +1;
                    break;
                case '5':
                    voton = +1;
                    break;
                case '6':
                    votob = +1;
                    break;

            }

        } while ('0' != voto);

        double ncand = 0;
        ncand = voto1 + voto2 + voto3 + voto4 + voton + votob;
        double porcsncand1 = ncand * (voto1 / 100);
        double porcsncand2 = ncand * (voto1 / 100);
        double porcsncand3 = ncand * (voto2 / 100);
        double porcsncand4 = ncand * (voto3 / 100);
        double porcsncandn = ncand * (voton / 100);
        double porcsncandb = ncand * (votob / 100);

        System.out.println("O numero total de candidatos é " + ncand + "\n"
                + "O numero de votos para o primeiro candidato é " + voto1 + " e seu percentual sobre o total é " + porcsncand1 + "\n"
                + "O numero de votos para o segundo candidato é " + voto2 + " e seu percentual sobre o total é " + porcsncand2 + "\n"
                + "O numero de votos para o primeiro candidato é " + voto3 + " e seu percentual sobre o total é " + porcsncand3 + "\n"
                + "O numero de votos para o primeiro candidato é " + voto4 + " e seu percentual sobre o total é " + porcsncand4 + "\n"
                + "O numero de votos nulos é " + voton + " e seu percentual sobre o total é " + porcsncandn + "\n"
                + "O numero de votos em branco é " + votob + " e seu percentual sobre o total é " + porcsncandb);

    }

}
