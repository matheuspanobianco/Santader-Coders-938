package Aula2;
/*Questão #2
Faça um programa que pegue o nome completo que o usuário digitar e imprima
o nome com cada parte separada por espaço, um símbolo de exclamação no início. Exemplo:

Nome: João Mario da Silva
Resultado: !João !Maria !da !Silva*/

import java.util.Scanner;

public class ExclamacaoNoInicio {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um nome completo: ");
        String nomeCompleto = teclado.nextLine();
        System.out.println("Nome: " + nomeCompleto);

        String[] nomeSeparado = nomeCompleto.split(" ");
        System.out.print("Resultado:");

        for (int i = 0; i < nomeSeparado.length; i++) {
            System.out.print(" !" + nomeSeparado[i]);
        }

    }
}
