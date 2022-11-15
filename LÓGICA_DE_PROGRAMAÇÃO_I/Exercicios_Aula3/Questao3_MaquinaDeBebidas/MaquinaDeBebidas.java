package BE_JV_001.LÓGICA_DE_PROGRAMAÇÃO_I.Exercicios_Aula3.Questao3_MaquinaDeBebidas;

/*Questão #3
Escreva um programa que simule uma máquina de venda de bebidas.
O usuário poderá escolher dentre 6 opções de bebidas abaixo:
1 - Coca-Cola - R$ 5
2 - Coca-Cola 0 - R$ 4.50
3 - Pepsi - R$ 4,40
4 - Guaraná Antarctica - R$ 3,50
5 - Fanta Laranja - R$ 4,23
6 - Água - R$ 2,50
O programa devera imprimir na tela o nome e preço do refrigerante selecionado, utilize switch.
*/


import BE_JV_001.LÓGICA_DE_PROGRAMAÇÃO_I.Exercicios_Aula3.Questao4_MaquinaDeBebidas_IfElse.ENUM_MaquinaDeBebidas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaquinaDeBebidas {

    public static void main(String[] args) {

        boolean entradaErrada = true;

        while (entradaErrada) {

            System.out.println("Opções de bebidas:\n" +
                    "1 - Coca-Cola\n" +
                    "2 - Coca-Cola Zero\n" +
                    "3 - Pepsi\n" +
                    "4 - Guaraná Antarctica\n" +
                    "5 - Fanta Laranja\n" +
                    "6 - Água\n" +
                    "Digite o numero da bebida desejada: ");

            try {

                Scanner teclado = new Scanner(System.in);
                int bebida = teclado.nextInt();

                switch (bebida) {
                    case 1:
                        System.out.printf("A bebida escolhida foi: %s\nValor: R$ %.2f", ENUM_MaquinaDeBebidas.COCA_COLA.getNome(), ENUM_MaquinaDeBebidas.COCA_COLA.getPreco());
                        break;
                    case 2:
                        System.out.printf("A bebida escolhida foi: %s\nValor: R$ %.2f", ENUM_MaquinaDeBebidas.COCA_COLA_ZERO.getNome(), ENUM_MaquinaDeBebidas.COCA_COLA_ZERO.getPreco());
                        break;
                    case 3:
                        System.out.printf("A bebida escolhida foi: %s\nValor: R$ %.2f", ENUM_MaquinaDeBebidas.PEPSI.getNome(), ENUM_MaquinaDeBebidas.PEPSI.getPreco());
                        break;
                    case 4:
                        System.out.printf("A bebida escolhida foi: %s\nValor: R$ %.2f", ENUM_MaquinaDeBebidas.GUARANA_ANTARCTICA.getNome(), ENUM_MaquinaDeBebidas.GUARANA_ANTARCTICA.getPreco());
                        break;
                    case 5:
                        System.out.printf("A bebida escolhida foi: %s\nValor: R$ %.2f", ENUM_MaquinaDeBebidas.FANTA_LARANJA.getNome(), ENUM_MaquinaDeBebidas.FANTA_LARANJA.getPreco());
                        break;
                    case 6:
                        System.out.printf("A bebida escolhida foi: %s\nValor: R$ %.2f", ENUM_MaquinaDeBebidas.AGUA.getNome(), ENUM_MaquinaDeBebidas.AGUA.getPreco());
                        break;
                    default:
                        System.out.println("Opção Inválida");
                        continue;
                }

                entradaErrada = false;

            } catch (InputMismatchException e) {
                System.out.println("Opção invalida");
            }

        }
    }
}
