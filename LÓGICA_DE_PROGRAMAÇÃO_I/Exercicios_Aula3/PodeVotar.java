package BE_JV_001.LÓGICA_DE_PROGRAMAÇÃO_I.Exercicios_Aula3;
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

        boolean entradaPositiva = true;

        while (entradaPositiva) {

            System.out.print("Digite a idade: ");

            try {

                Scanner teclado = new Scanner(System.in);
                int idade = teclado.nextInt();

                if (idade < 0 || idade > 150) {
                    System.out.println("Idade inválida");
                    continue;
                } else if (idade >= 18 && idade <= 70) {
                    System.out.println("Voto obrigatório");
                } else if (idade >= 16 && idade < 18 || idade > 70) {
                    System.out.println("Voto  facultativo");
                } else {
                    System.out.println("Sem direito a votar");
                }

                entradaPositiva = false;

            } catch (InputMismatchException e) {
                System.out.println("Idade inválida");
            }

        }

    }

}