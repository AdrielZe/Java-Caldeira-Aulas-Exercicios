package aula_5;

public class Exercicio3_Tarefas {
    private String title;
    private String date;
    private String description;

    public Exercicio3_Tarefas(String title, String date, String description){
        this.title = title;
        this.date = date;
        this.description = description;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDate() {
        return this.date;
    }

    public String getDescription() {
        return this.description;
    }
}
