package BE_JV_001.LÓGICA_DE_PROGRAMAÇÃO_I.Exercicios_Aula4;
import java.util.Arrays;

public class Aula4_ClasseArrays {

        public static void main(String[] args) {
            int[] numeros = new int[3];
            numeros[0] = 1;
            numeros[1] = 10;
            numeros[2] = 5;

            Arrays.sort(numeros);
        /*
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[i];
            System.out.println(valor);
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }

         */

            System.out.println(Arrays.toString(numeros));
            System.out.println(Arrays.binarySearch(numeros, 10));

        }
}
