package aula_8_exercicio2_gradle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto perfume = new Produto("Perfume",30.00, 4);
        Produto desodorante = new Produto("Desodorante", 13.99, 27);
        Produto papelHigienico = new Produto("Papel higiênico", 19.99,5);
        Produto detergente = new Produto("Detergente", 8.75,11);
        Produto vassoura = new Produto("Vassoura", 39.99, 12);
        double precoTotal;

        produtos.add(perfume);
        produtos.add(desodorante);
        produtos.add(papelHigienico);
        produtos.add(detergente);
        produtos.add(vassoura);

        Optional<Produto> produtoMaisCaro = produtos.stream().max(Comparator.comparingDouble(Produto::getPreco));

        produtoMaisCaro.ifPresent(produto -> System.out.println("Produto mais caro: " + produto.getNome()));

        precoTotal = produtos.stream().mapToDouble(Produto::getPreco).sum();
        System.out.println("Preço total de todos os produtos: " + precoTotal);

        List<Produto> produtosComMaisDe10Unidades = produtos.stream().filter(produto -> produto.getQuantidade() > 10).toList();
        System.out.println("Produtos que possuem mais de 10 unidades disponíveis: ");
        produtosComMaisDe10Unidades.forEach(produto -> System.out.println(produto.getNome()));


    }
}