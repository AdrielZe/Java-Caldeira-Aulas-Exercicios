package aula_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercicio2_imprimeTerceiraIdade {
    public void imprimeTerceiraIdade(Map<String, Integer> clients){
       for (Map.Entry<String,Integer> entrada : clients.entrySet()){
           if (entrada.getValue() >= 60){
               System.out.println(entrada.getKey() + " é da terceira idade.");
           }
       }
    }
}
