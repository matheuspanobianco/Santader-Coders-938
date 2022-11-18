package BE_JV_001.LÓGICA_DE_PROGRAMAÇÃO_I.Exercicios_Aula4.Questao1_PodeVotar_Teste;
/*
Questão #1
Escreva um programa para verificar se uma pessoa pode votar ou não, de acordo com sua idade.
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

public class PodeVotar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int idade;
        boolean entradaPositiva = true;
        while (entradaPositiva) {


            System.out.print("Digite a idade: ");

            try {

                idade = teclado.nextInt();

                if (tipoVoto(idade).equals("Idade inválida")) {
                    System.out.println(tipoVoto(idade));
                    continue;
                }

                System.out.println(tipoVoto(idade));

                entradaPositiva = false;

            } catch (InputMismatchException e) {
                teclado.nextLine();
                System.out.println("Idade inválida");
            }

        }

    }

    public static String tipoVoto(int idadeParaVotar) {
        String textoVoto;
        if (idadeParaVotar < 0 || idadeParaVotar > 150) {
            textoVoto = "Idade inválida";
        } else if (idadeParaVotar >= 18 && idadeParaVotar <= 70) {
            textoVoto = "Voto obrigatório";
        } else if (idadeParaVotar >= 16 && idadeParaVotar < 18 || idadeParaVotar > 70) {
            textoVoto = "Voto  facultativo";
        } else {
            textoVoto = "Sem direito a votar";
        }
        return textoVoto;
    }
}
 