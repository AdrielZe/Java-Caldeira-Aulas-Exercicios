package aula_6;

import java.util.LinkedHashMap;

public class Exercicio4 {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> priceList = new LinkedHashMap<>();

        priceList.put("Arroz",5.9);
        priceList.put("Feijão", 6.70);
        priceList.put("Abobrinha", 2.00);
        priceList.put("Banana", 6.21);
        priceList.put("Coca-Cola", 8.00);
        priceList.put("Pão", 2.00);

        System.out.println(priceList);
    }
}
