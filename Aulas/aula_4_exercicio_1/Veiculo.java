package aula_4_exercicio_1;

public abstract class Veiculo {
    public String brand;
    public String model;
    public int year;

    public double calculateTravelPrice(double distance,double price){
      return distance * price;
    };
}
