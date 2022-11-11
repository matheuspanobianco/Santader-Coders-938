package BE_JV_001.LÓGICA_DE_PROGRAMAÇÃO_I.Exercicios_Aula2;
/*Questão #1
Faça um programa que receba uma frase com "Janeiro: 1543, Fevereiro: 1222, Março: 1234".
Imprima sequencialmente em linhas separadas por cada mês e na última linha a frase:
"Total: " e o valor da soma de todos os meses. Exemplo:

Janeiro: 1543
Fevereiro: 1222
Março: 1234
Total: 3999 */

public class SeparaFrases {

    public static void main(String[] args) {

        String frases = "Janeiro: 1543, Fevereiro: 1222, Março: 1234";
        String[] frasesSeparadas = frases.split(", ");
        int total = 0;

        for (int i = 0; i < frasesSeparadas.length; i++) {

            System.out.println(frasesSeparadas[i]);

        }

        for (int j = 0; j < frasesSeparadas.length; j++) {

            String[] valoresDoMes = frasesSeparadas[j].split(": ");
            total += Integer.parseInt(valoresDoMes[1]);

        }

        System.out.println("Total: " + total);

    }

}
