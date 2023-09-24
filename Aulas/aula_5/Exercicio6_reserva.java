package aula_5;

public class Exercicio6_reserva {
    private String name;
    private String location;
    private String cpf;
    private String arrivingDate;
    private String leavingDate;

    public Exercicio6_reserva(String name, String location, String cpf, String arrivingDate, String leavingDate) {
        this.name = name;
        this.location = location;
        this.cpf = cpf;
        this.arrivingDate = arrivingDate;
        this.leavingDate = leavingDate;
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getArrivingDate() {
        return this.arrivingDate;
    }

    public String getLeavingDate() {
        return this.leavingDate;
    }
}
