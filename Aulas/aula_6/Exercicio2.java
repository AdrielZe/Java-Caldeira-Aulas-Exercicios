package aula_6;

import java.util.HashMap;
import java.util.Map;

public class Exercicio2 {
    public static void main(String[] args) {
        Map<String, Integer> clients = new HashMap<String,Integer>();
        clients.put("Adriel", 21);
        clients.put("Vizeu", 17);
        clients.put("Matheus", 30);
        clients.put("Ândria", 23);
        clients.put("Arthur", 17);
        clients.put("Otavio", 19);

        Exercicio2_imprimeTerceiraIdade imprime = new Exercicio2_imprimeTerceiraIdade();

        imprime.imprimeTerceiraIdade(clients);

    }
}
