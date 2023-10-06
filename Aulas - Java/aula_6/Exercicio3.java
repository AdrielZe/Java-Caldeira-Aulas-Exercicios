package aula_6;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Exercicio3 {
    public static void main(String[] args) {
        Exercicio3_dividePorLocal divisorPorLocal = new Exercicio3_dividePorLocal();
        TreeMap<String, Exercicio3_contato> listaContatos = new TreeMap<>();
        ArrayList<String> contatos = new ArrayList<String>();
        Exercicio3_contato anaPaula = new Exercicio3_contato("Ana Paula","551234123","Carazinho 253","Sul");
        Exercicio3_contato robertoAntonio = new Exercicio3_contato("Roberto Antonio","5143514321","Bom Jesus 82","Sul");
        Exercicio3_contato beatrice = new Exercicio3_contato("Beatrice","6531432323","Edificios 2","Leste");
        Exercicio3_contato joao = new Exercicio3_contato("João","45572364387","Casaluma 21","Norte");
        Exercicio3_contato pericles= new Exercicio3_contato("Péricles","63545","Ruas bhas 3","Oeste");
        Exercicio3_contato adriel = new Exercicio3_contato("Adriel","12213432","Ruas duzentosmil 7","Oeste");
        Exercicio3_contato lucas = new Exercicio3_contato("Lucas","56712345","Hotel guanabara 23","Norte");

        listaContatos.put("Roberto Antonio",robertoAntonio);
        listaContatos.put("Ana Paula",anaPaula);
        listaContatos.put("Beatrice",beatrice);
        listaContatos.put("João",joao);
        listaContatos.put("Péricles", pericles);
        listaContatos.put("Adriel", adriel);
        listaContatos.put("Lucas",lucas);

        for (Map.Entry<String,Exercicio3_contato> chaveAtual : listaContatos.entrySet()){
            contatos.add(chaveAtual.getKey());
        }

        System.out.println("\nLista em ordem alfabética: ");
        for (Map.Entry<String,Exercicio3_contato> chaveAtual : listaContatos.entrySet()){
            System.out.println(chaveAtual.getValue().exibeInformacoes());
        }

        System.out.println("\nLista por ordem de localidade: ");
        divisorPorLocal.dividePorLocal(listaContatos);
    }
}
