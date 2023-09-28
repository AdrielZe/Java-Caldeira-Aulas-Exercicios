package aula_7;

import java.util.Scanner;

public class Exercicio2_main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String diaEscolhido = "";

        System.out.println("Digite um dia da semana: ");
        diaEscolhido = input.nextLine().toUpperCase();

        Exercicio2_diaDaSemana.escolherDiaDaSemana(Exercicio2_diaDaSemana.valueOf(diaEscolhido));
        };
}


