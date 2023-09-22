package aula_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Object> shoppingList = new ArrayList<>();
        int option;

        do {
            System.out.println("---- Lista de compras----");
            System.out.println("O que você deseja fazer?");
            System.out.println("1- Adicionar compras a lista");
            System.out.println("2- Remover compras da lista");
            System.out.println("3- Exibir todas as compras na lista.");
            System.out.println("4- Sair");

            option = input.nextInt();

            switch (option){
                case 1 -> {
                    String itemTitle;
                    String itemExpiration;

                    System.out.println("Digite o item da sua compra: ");
                    itemTitle = input.nextLine();
                    itemTitle = input.nextLine();


                    System.out.println("Digite a data de validade: ");
                    itemExpiration = input.nextLine();

                    Exercicio4_compra item = new Exercicio4_compra(itemTitle, itemExpiration);

                    shoppingList.add("Nome da compra: " + item.getNome() + "\nData de validade: " + item.getDataDeValidade());
                }

                case 2 -> {
                    if (!shoppingList.isEmpty()) {
                        System.out.println("Qual item você deseja remover? (Digite o índice)");

                        for (int i = 0; i < shoppingList.size(); i++){
                            System.out.println("--------------");
                            System.out.println((i + 1) + " - " + shoppingList.get(i));
                            System.out.println("--------------");
                        }

                        shoppingList.remove(input.nextInt() - 1);
                        System.out.println("Item removido com sucesso!");
                    } else {
                        System.out.println("Sua lista está vazia. Adicione pelo menos um item para remover.");
                    }
                }

                case 3 -> {
                    if(!shoppingList.isEmpty()) {
                        for (int i = 0; i < shoppingList.size(); i++) {
                            System.out.println("--------------");
                            System.out.println((i + 1) + " - " + shoppingList.get(i));
                            System.out.println("--------------");
                        }
                    } else {
                        System.out.println("Sua lista está vazia. Adicione pelo menos um item para vê-la aqui.");
                    }
                }

                case 4 -> System.out.println("Encerrando programa.");

                default -> System.out.println("Opção inválida. Digite uma opção válida.");
            }
        } while (option != 4);

    }
}

