package aula_5;

public class Exercicio4_compra {
    private String nome;
    private String dataDeValidade;

    public Exercicio4_compra(String nome, String dataDeValidade){
        this.nome = nome;
        this.dataDeValidade = dataDeValidade;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDataDeValidade() {
        return this.dataDeValidade;
    }
}
