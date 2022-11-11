package Aula2.Exercicio_Complementar;
/*Questão #1
Faça um programa, que solicite ao usuário que informe o mês e o sistema deve imprimir o valor gasto do mês.
->Considerações:

Utilizar enum
Criar um valor para cada mês
*/

import Aula2.Exercicio_Complementar.Meses;

import java.util.*;

public class Meses_Gasto {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreve o nome do mês para saber o valor gasto: ");
        String nomeDoMes = teclado.nextLine().trim().toUpperCase();

        List<Meses> listaDoENUM = Arrays.asList(Meses.values());
        
        //List<Meses> listaDoENUM = new ArrayList<>(EnumSet.allOf(Meses.class));

        for (int i = 0; i < listaDoENUM.size(); i++){

            boolean comparacaoEntrada = Objects.equals(listaDoENUM.get(i).NomeMes(), nomeDoMes);

            if (comparacaoEntrada){
                float gastoFinal = listaDoENUM.get(i).GastoMes();
                System.out.println("O gasto é de: " + gastoFinal);

            }

        }

    }

}
