package BE_JV_001.LÓGICA_DE_PROGRAMAÇÃO_I.Exercicios_Aula3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aula3_BufferedReader {
    public static void main(String[] args){
        System.out.println("Informe a idade:");
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            //realizar casting manual para o tipo da váriavel
            int idade = Integer.parseInt(rd.readLine());
            System.out.println(idade);
            rd.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
