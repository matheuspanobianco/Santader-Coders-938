/*Questão #1
A empresa "XPTO S.A", precisa fazer o fechamento do balanço do primeiro trimestre. Os dados passados pela empresa são:
Janeiro: R$ 10000
Fevereiro: R$ 17000
Marco: R$ 23000.
Faça um programa que calcule e imprima o gasto total do trimestre.*/

public class Xpto_sa {

    public static void main(String[] args) {

        System.out.print("O gasto total do trimestre foi de: " + soma());

    }

    public static double soma() {

        double janeiro = 10000;
        double fevereiro = 17000;
        double marco = 23000;

        return (janeiro + fevereiro + marco);

    }

}
