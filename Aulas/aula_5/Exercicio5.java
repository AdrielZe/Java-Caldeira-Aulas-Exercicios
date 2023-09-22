package aula_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        LinkedList<Object> printingLine = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        int option;


        do {
            System.out.println("----- Fila de documentos -----");
            System.out.println("Você deseja: ");
            System.out.println("1- Adicionar o documento à fila.");
            System.out.println("2- Imprimir documento.");
            System.out.println("3- Sair");
            option = input.nextInt();

            switch (option) {
                case 1 -> {
                    String name;
                    int numberOfPages;

                    System.out.println("Qual é o seu nome?");
                    name = input.nextLine();

                    System.out.println("Qual é o número de páginas do seu documento?");
                    numberOfPages = input.nextInt();

                    Exercicio5_document document = new Exercicio5_document(name,numberOfPages);

                    printingLine.add(document);
                }
                case 2 -> {
                    System.out.println("Documento de " + printingLine.get(0) + " foi impresso.");
                    printingLine.remove()
                    System.out.println("Próximo da fila: " + );
                }
            }


        } while (option != 3);


    }
}
