package aula_6;

import java.util.HashSet;
import java.util.Iterator;

public class Exercicio1 {
    public static void main(String[] args) {
        HashSet<Exercicio1_livro> livros = new HashSet<>();
        Exercicio1_livro pequenoPrincipe = new Exercicio1_livro("O pequeno príncipe", "Aventura");
        Exercicio1_livro mazeRunner = new Exercicio1_livro("Maze Runner", "Ação");
        Exercicio1_livro harryPotter = new Exercicio1_livro("Harry Potter","Aventura");
        livros.add(pequenoPrincipe);
        livros.add(mazeRunner);
        livros.add(harryPotter);

        for (Exercicio1_livro livro : livros){
            System.out.println(livro.getTitle() + " - " + livro.getCategory());
        }

        for (Exercicio1_livro livro : livros){
            if(livro.getCategory().equals("Aventura")){
                System.out.println(livro.getTitle() + " - " + livro.getCategory());
            }
        };


        for(Iterator<Exercicio1_livro> it = livros.iterator(); it.hasNext();){
            Exercicio1_livro livro = it.next();
            it.remove();
        }

        if (livros.isEmpty()){
            System.out.println("Vazio!");
        }
    }
}
