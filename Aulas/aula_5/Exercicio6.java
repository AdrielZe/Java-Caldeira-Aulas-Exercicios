package aula_5;

import java.util.LinkedList;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        LinkedList<Object> reservations = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("---- Bem vindo ao sistema de reservas de passagens aéreas!! ----");
            System.out.println("O que você deseja fazer?");
            System.out.println("1- Fazer uma reserva.");
            System.out.println("2- Cancelar uma reserva.");
            System.out.println("3- Consultar lista de reservas.");
            System.out.println("4- Sair");
            option = input.nextInt();

            switch (option) {
                case 1 -> {
                    String reservationName;
                    String reservationLocation;
                    String reservationCpf;
                    String reservationDepartingDate;
                    String reservationReturnFlightDate;

                    System.out.println("Digite o seu nome: ");
                    reservationName = input.nextLine();
                    reservationName = input.nextLine();

                    System.out.println("Digite o local de destino da sua passagem: ");
                    reservationLocation = input.nextLine();

                    System.out.println("Digite o seu CPF: ");
                    reservationCpf = input.nextLine();

                    System.out.println("Digite a data da partida de sua reserva: ");
                    reservationDepartingDate = input.nextLine();

                    System.out.println("Digite a data do seu voo de volta: ");
                    reservationReturnFlightDate = input.nextLine();

                    Exercicio6_reserva reservation = new Exercicio6_reserva(reservationName, reservationLocation, reservationCpf, reservationDepartingDate, reservationReturnFlightDate);

                    reservations.add(reservation);
                }
                case 2 -> {
                    int index = 1;
                    int optionToRemove;
                    System.out.println("Qual reserva você quer cancelar? (Digite o índice)");

                    for (Object o : reservations) {
                        Exercicio6_reserva reservation = (Exercicio6_reserva) o;
                        System.out.println(index + " - Nome do cliente: " + (reservation.getName()));
                        System.out.println("Indo para: " + (reservation.getLocation()));
                        System.out.println("CPF do cliente: " + (reservation.getCpf()));
                        System.out.println("Data de saída do voo: " + (reservation.getArrivingDate()));
                        System.out.println("Data de volta do voo: " + (reservation.getLeavingDate()));
                        System.out.println("\n");
                        index++;
                    }

                    optionToRemove = input.nextInt();
                    reservations.remove(optionToRemove - 1);
                }
                case 3 -> {
                    int index = 1;
                    for (Object o : reservations) {
                        Exercicio6_reserva reservation = (Exercicio6_reserva) o;
                        System.out.println(index + " - Nome do cliente: " + (reservation.getName()));
                        System.out.println("Indo para: " + (reservation.getLocation()));
                        System.out.println("CPF do cliente: " + (reservation.getCpf()));
                        System.out.println("Data de saída do voo: " + (reservation.getArrivingDate()));
                        System.out.println("Data de volta do voo: " + (reservation.getLeavingDate()));
                        System.out.println("\n");
                        index++;
                    }
                }
            }
        } while (option != 4);

    }
}
