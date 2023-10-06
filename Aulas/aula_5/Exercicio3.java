package aula_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Object> tasksList = new ArrayList<>();
        int option;

        do {
            System.out.println("---- Lista de tarefas ----");
            System.out.println("O que você deseja fazer?");
            System.out.println("1- Adicionar tarefas a lista");
            System.out.println("2- Remover tarefas da lista");
            System.out.println("3- Exibir todas as tarefas na lista.");
            System.out.println("4- Sair");

            option = input.nextInt();

            switch (option){
                case 1 -> {
                    String taskTitle;
                    String taskDescription;
                    String taskDate;

                    System.out.println("Digite o título da sua tarefa: ");
                    taskTitle = input.nextLine();
                    taskTitle = input.nextLine();

                    System.out.println("Digite a descrição da sua tarefa: ");
                    taskDescription = input.nextLine();

                    System.out.println("Digite a data em que você precisa realizar esta tarefa: ");
                    taskDate = input.nextLine();

                    Exercicio3_Tarefas task = new Exercicio3_Tarefas(taskTitle,taskDate,taskDescription);

                    tasksList.add("Nome da tarefa: " + task.getTitle() + "\nDescrição da tarefa: " + task.getDescription() + "\nData para realizar: " + task.getDate());
                }

                case 2 -> {
                    if (!tasksList.isEmpty()) {
                        System.out.println("Qual tarefa você deseja remover? (Digite o índice)");

                        for (int i = 0; i < tasksList.size(); i++){
                            System.out.println("--------------");
                            System.out.println((i + 1) + " - " + tasksList.get(i));
                            System.out.println("--------------");
                        }

                        tasksList.remove(input.nextInt() - 1);
                        System.out.println("Tarefa removida com sucesso!");
                    } else {
                        System.out.println("Sua lista está vazia. Adicione pelo menos uma tarefa para remover.");
                    }
                }

                case 3 -> {
                    if(!tasksList.isEmpty()) {
                        for (int i = 0; i < tasksList.size(); i++) {
                            System.out.println("--------------");
                            System.out.println((i + 1) + " - " + tasksList.get(i));
                            System.out.println("--------------");
                        }
                    } else {
                        System.out.println("Sua lista está vazia. Adicione pelo menos uma tarefa para vê-la aqui.");
                    }
                }

                case 4 -> System.out.println("Encerrando programa.");

                default -> System.out.println("Opção inválida. Digite uma opção válida.");
            }
        } while (option != 4);
    }
}

