package BE_JV_001.LÓGICA_DE_PROGRAMAÇÃO_I.Exercicios_Aula5;

import java.util.*;

/*Questao #1
Crie um programa que simule uma lista(carrinho) de compras.
O programa deve receber produtos, quantidade e seus respectivos preços.
Ao receber todos os produtos, o programa deve imprimir todos os produtos,
quantidade, os preços informados e o preço total dos produtos no carrinho.
 */
public class CarrinhoDeCompras {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean adicionarNovoProduto = true;
        boolean continuar_Lista = true;
        List<String> lista_Produtos = new ArrayList<>();
        List<Integer> quantidade_Produtos = new ArrayList<>();
        List<Float> preco_Produtos = new ArrayList<>();

        do {

            adicionarItens(teclado, lista_Produtos, quantidade_Produtos, preco_Produtos);
            adicionarNovoProduto = continuarNoCarrinho(teclado, adicionarNovoProduto, lista_Produtos, quantidade_Produtos, preco_Produtos);


        } while (adicionarNovoProduto);


    }

    private static boolean continuarNoCarrinho(Scanner teclado, boolean adicionarNovoProduto, List<String> lista_Produtos, List<Integer> quantidade_Produtos, List<Float> preco_Produtos) {
        boolean continuar_Lista;
        int mais_Produtos;
        int quantidadeTotal_Produtos;
        float precoTotal_Produtos;
        do {
            try {
                System.out.println("Deseja adicionar mais algum produto?\n1 - Sim\n2 - Não");
                mais_Produtos = teclado.nextInt();
                if (mais_Produtos == 1) {
                    continuar_Lista = false;
                    adicionarNovoProduto = true;

                } else if (mais_Produtos == 2) {
                    quantidadeTotal_Produtos = 0;
                    precoTotal_Produtos = 0;
                    System.out.println("\nCarrinho de produtos:");
                    for (int i = 0; i < lista_Produtos.size(); i++) {
                        quantidadeTotal_Produtos += quantidade_Produtos.get(i);
                        System.out.printf("%s - %s - R$%.2f unidade - R$%.2f total\n", quantidade_Produtos.get(i), lista_Produtos.get(i), preco_Produtos.get(i), (preco_Produtos.get(i) * quantidade_Produtos.get(i)));
                        precoTotal_Produtos += preco_Produtos.get(i) * quantidade_Produtos.get(i);
                    }
                    System.out.printf("\nTotal:\n%s produtos - R$%.2f total", quantidadeTotal_Produtos, precoTotal_Produtos);
                    continuar_Lista = false;
                    adicionarNovoProduto = false;
                } else {
                    System.out.println("Não é uma opção válida...");
                    continuar_Lista = true;
                }
            } catch (InputMismatchException e) {
                teclado.nextLine();
                System.out.println("Entrada inválida. Digite 1 para 'sim' ou 2 para 'não'");
                continuar_Lista = true;
            }
        } while (continuar_Lista);
        teclado.nextLine();
        return adicionarNovoProduto;
    }

    private static void adicionarItens(Scanner teclado, List<String> lista_Produtos, List<Integer> quantidade_Produtos, List<Float> preco_Produtos) {
        boolean entradaQuantidadeInvalida = true;
        boolean entradaPrecoInvalido = true;
        int entradaQuantidade = 0;
        float entradaPreco = 0;
        System.out.println("Escreva o nome do produto: ");
        lista_Produtos.add(teclado.nextLine().toLowerCase().trim());
        while (entradaQuantidadeInvalida) {
            try {
                System.out.println("Escreva a quantidade do produto: ");
                entradaQuantidade = teclado.nextInt();
                if(entradaQuantidade<0){
                    System.out.println("Quantidade inválida...");
                    continue;
                }
                quantidade_Produtos.add(entradaQuantidade);
                entradaQuantidadeInvalida = false;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite novamente a quantidade.");
                teclado.nextLine();
            }
        }
        while (entradaPrecoInvalido) {
            try {
                System.out.println("Escreva o preço do produto: ");
                entradaPreco = teclado.nextFloat();
                if(entradaPreco<0){
                    System.out.println("Preço inválido...");
                    continue;
                }
                preco_Produtos.add(entradaPreco);
                entradaPrecoInvalido = false;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite Novamente.");
                teclado.nextLine();
            }
        }
    }
}

