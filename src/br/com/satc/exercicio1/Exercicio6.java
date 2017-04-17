package br.com.satc.exercicio1;

/**
 *
 * @author Edutec
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float ana = (float) 1.50;
        float felis = (float) 1.10;
        int ano = 0;
        do {
            ana += 0.02;
            felis += 0.03;
            ano++;
        } while (ana > felis) ;
        System.out.println("Demoraria " + ano + " anos para Felisberto ser maior "
                + "que Anacleto .");

    }

}
