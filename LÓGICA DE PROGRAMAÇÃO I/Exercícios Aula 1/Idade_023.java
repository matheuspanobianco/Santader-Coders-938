/*Questão #2
Faça um programa que dado a idade em uma variável inteira, adicione as casas decimais: ".023".
Após imprima a mensagem "O número da sorte é: " e imprima o número resultante.
Para isso, utilize alguma forma de casting.
*/

public class Idade_023 {

    public static void main(String[] args) {

        System.out.println("O número da sorte é: " + numeroDaSorte());

    }

    public static float numeroDaSorte() {

        int idade = 10;
        double idadeDecimal = idade + .023;
        return idadeDecimal;
        //return (float) (idade + .023);

    }

}
