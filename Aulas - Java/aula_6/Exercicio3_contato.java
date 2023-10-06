package aula_6;

public class Exercicio3_contato {
    private String name;
    private String phoneNumber;
    private String address;
    private String location;

    public Exercicio3_contato(String name, String phoneNumber, String address, String location) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.location = location;
    }

    public String exibeInformacoes(){
        return ("\n" + this.name + " - Número de telefone: " + this.phoneNumber + " - Endereço: " + this.address + " - Localização: " + this.location + "");
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getLocation() {
        return location;
    }
}
