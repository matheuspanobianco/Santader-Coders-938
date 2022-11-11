package BE_JV_001.LÓGICA_DE_PROGRAMAÇÃO_I.Exercicios_Aula2;

public class Aula2_Strings {
        public static void main(String[] args) {
            String string = new String("Oi");
            String string2 = "Tchau";

            Integer numero = 3 + 5;
            String soma = "Soma = ".concat(numero+"");
            int tamanho = soma.length();
            String email = "GaBriEl@hotmail.com";
            String[] split = email.split("@");
            System.out.println(split[0]);
            System.out.println(split[1]);
            String email2 = String.join(" ",split[0],split[1],"Teste");
            System.out.println(email2.toUpperCase());
            String espaco = "   1 2 3 4 5   ";
            //String strFinal += split[i];
            espaco = espaco.trim();
            System.out.println(espaco);

            String[] strArr = espaco.trim().split(" ");
            StringBuilder strFinal = new StringBuilder();
            for (String s : strArr) {
                strFinal.append(s);
            }

            System.out.println("->" + strFinal);


            String nome = "gabriel";
            String nome2 = "    gabriel";


        }
    }
