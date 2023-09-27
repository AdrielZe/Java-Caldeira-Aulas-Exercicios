package aula_6;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Exercicio3_dividePorLocal {
    StringBuilder south = new StringBuilder();
    StringBuilder north = new StringBuilder();
    StringBuilder east = new StringBuilder();
    StringBuilder west = new StringBuilder();
    ArrayList<String> southLocation = new ArrayList<>();
    ArrayList<String> northLocation = new ArrayList<>();
    ArrayList<String> westLocation = new ArrayList<>();
    ArrayList<String> eastLocation = new ArrayList<>();

    public void dividePorLocal(TreeMap<String,Exercicio3_contato> contacts){
        for(Map.Entry<String,Exercicio3_contato> chaveAtual : contacts.entrySet()){
            switch (chaveAtual.getValue().getLocation()){
                case "Sul" -> southLocation.add(chaveAtual.getValue().exibeInformacoes());
                case "Norte" -> northLocation.add(chaveAtual.getValue().exibeInformacoes());
                case "Leste" -> eastLocation.add(chaveAtual.getValue().exibeInformacoes());
                case "Oeste" -> westLocation.add(chaveAtual.getValue().exibeInformacoes());
            }
        }
        for(String x : southLocation){
            south.append(x);
        }
        for(String y : northLocation){
            north.append(y);
        }
        for(String z : eastLocation){
            east.append(z);
        }
        for(String a : westLocation){
            west.append(a);
        }
        System.out.println("\nSul: ");
        System.out.println(south);
        System.out.println("\nNorte: ");
        System.out.println(north);
        System.out.println("\nLeste: ");
        System.out.println(east);
        System.out.println("\nOeste: ");
        System.out.println(west);
    }

}
