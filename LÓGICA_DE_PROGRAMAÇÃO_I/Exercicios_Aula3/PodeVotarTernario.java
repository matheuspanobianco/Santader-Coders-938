package BE_JV_001.LÓGICA_DE_PROGRAMAÇÃO_I.Exercicios_Aula3;
/*
Questão #2
Escreva um programa para verificar se uma pessoa pode votar ou não, de acordo com sua idade.
*Use operador ternário*.
O programa deve escrever na tela as seguintes informacões:
"Voto obrigatório"  - para eleitoras e eleitores, com idades entre 18 e 70 anos.
"Voto  facultativo" - para maiores ou iguais a 16 anos e menores de 18 anos;
 assim como maiores de 70 anos.
"Sem direito a votar" - para o restante.
Fonte: https://www.tre-sc.jus.br/eleicoes/tire-suas-duvidas/voto-obrigatoriedade
* Exemplo
Entrada - 16
Saida - Voto Facultativo*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class PodeVotarTernario {

    public static void main(String[] args) {

        boolean entradaPositiva = true;

        while (entradaPositiva) {

            System.out.print("Digite a idade: ");

            try {

                Scanner teclado = new Scanner(System.in);
                int idade = teclado.nextInt();
                String voto;

                voto = (idade < 0 || idade > 150) ?
                        "Idade inválida" :
                        ((idade >= 18 && idade <= 70) ?
                                "Voto obrigatório" :
                                ((idade >= 16 && idade < 18 || idade > 70) ?
                                        "Voto  facultativo" :
                                        "Sem direito a votar"));

                System.out.println(voto);

                if (voto.equals("Idade inválida")) {
                    continue;
                }

                entradaPositiva = false;

            } catch (InputMismatchException e) {
                System.out.println("Idade inválida");

            }

        }
    }
}