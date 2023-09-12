package Aula_1;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int hour,minute,second;

        do {
            System.out.println("Digite a hora");
            hour = input.nextInt();
        } while(hour > 23 || hour < 0);

            do {
                System.out.println("Digite o minuto");
                minute = input.nextInt();
            } while (minute > 60 || minute < 0);

            do {
                System.out.println("Digite o segundo");
                second = input.nextInt();
            } while (second > 60 || second < 0);

            int secondsPassed = (hour * 3600) + (minute * 60) + second;

            System.out.println("Horário: " + hour + ":" + minute + ":" + second);
            System.out.println("Desde a última meia-noite, passaram-se " + secondsPassed + " segundos");
            System.out.println("Para a próxima meia-noite, faltam " + (86400 - secondsPassed) + " segundos");

            input.close();
    }
}
