package aula_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        HashMap<String, Integer> clients = new HashMap<String,Integer>();
        ArrayList<String> list = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        String nameToSearch = "";

        clients.put("Adriel", 21);
        clients.put("Vizeu", 70);
        clients.put("Matheus", 30);
        clients.put("Ândria", 23);
        clients.put("Arthur", 60);
        clients.put("Otavio", 19);

        for (Map.Entry<String,Integer> entrada: clients.entrySet() ){
            list.add(entrada.getKey());
        }

        for (Map.Entry<String,Integer> entrada: clients.entrySet() ){
            System.out.println(entrada.getKey());
        }

        System.out.println("\nDigite um nome presente na lista para descobrir a idade: ");
        nameToSearch = input.nextLine();

        if(!clients.containsKey(nameToSearch)){
            System.out.println("Esse nome não está na lista.");
        } else {
            System.out.println("A idade é: " + clients.get(nameToSearch));
        }

        System.out.println("\nPessoas da lista que são da terceira idade: \n");
        Exercicio2_imprimeTerceiraIdade imprime = new Exercicio2_imprimeTerceiraIdade();

        imprime.imprimeTerceiraIdade(clients,list);
    }
}
