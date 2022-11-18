package BE_JV_001.LÓGICA_DE_PROGRAMAÇÃO_I.Exercicios_Aula4.Questao1_PodeVotar_Teste;


import static BE_JV_001.LÓGICA_DE_PROGRAMAÇÃO_I.Exercicios_Aula4.Questao1_PodeVotar_Teste.PodeVotar.tipoVoto;

public class PodeVotar_Teste {

    public static void main(String[] args) {

        int[][] testeIdade = {{18, 46, 70}, {16, 17, 71}, {0, 8, 15}};
        String[][] testeVotoEsperado = {{"Voto obrigatório", "Voto obrigatório", "Voto obrigatório"},
                {"Voto  facultativo", "Voto  facultativo", "Voto  facultativo"},
                {"Sem direito a votar", "Sem direito a votar", "Sem direito a votar"}};
        String[][] testeFalho = new String[3][3];
        int numeroDoTeste = 1;
        int quantidadeSucesso = 0;
        for (int i = 0; i < testeIdade.length; i++) {
            for (int j = 0; j < testeIdade.length; j++) {
                if (tipoVoto(testeIdade[i][j]).equals(testeVotoEsperado[i][j])) {
                    System.out.println("Teste" + numeroDoTeste + " - Sucesso");
                    quantidadeSucesso++;
                } else {
                    testeFalho[i][j] = "Teste" + numeroDoTeste + " - Resultado: " + tipoVoto(testeIdade[i][j]) + " - Correto: " + testeVotoEsperado[i][j];
                    System.out.println("Teste" + numeroDoTeste + " - Falha");
                }
                numeroDoTeste++;
            }
        }

        System.out.println();

        if (quantidadeSucesso == 9) {
            System.out.println("Testes executados com sucesso!");
        } else {
            System.out.println("Os seguintes testes falharam:");
            for (String[] testeFalhoArray : testeFalho) {
                for (String testeFalhoSemNulo : testeFalhoArray) {
                    if (testeFalhoSemNulo != null) {
                        System.out.println(testeFalhoSemNulo);
                    }
                }
            }
        }
    }

}
