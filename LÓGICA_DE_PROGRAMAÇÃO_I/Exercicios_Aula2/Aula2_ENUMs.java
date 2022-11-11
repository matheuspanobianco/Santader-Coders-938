package BE_JV_001.LÓGICA_DE_PROGRAMAÇÃO_I.Exercicios_Aula2;

public class Aula2_ENUMs {
    public static void main(String[] args) {

        Float firstQuarterTotalExpense = Aula2_ClasseENUM.JANUARY_EXPENSE.getValor() +
                Aula2_ClasseENUM.FEBRUARY_EXPENSE.getValor() +
                Aula2_ClasseENUM.MARCH_EXPENSE.getValor();

        System.out.printf("O gasto total no trimestre é: R$ %.2f.\n", firstQuarterTotalExpense);

        String mes = "JANUARY_TRIMESTRE";

    }
}
