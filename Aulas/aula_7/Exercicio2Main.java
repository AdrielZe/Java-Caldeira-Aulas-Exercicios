package aula_7;

import java.util.Scanner;

public class Exercicio2Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String diaEscolhido = "";

        System.out.println("Digite um dia da semana: ");
        diaEscolhido = input.nextLine().toUpperCase();

        Exercicio2DiaDaSemana.escolherDiaDaSemana(Exercicio2DiaDaSemana.valueOf(diaEscolhido));
        };
}


