package aula_4_exercicio_2;

public class Circulo extends FormaGeometrica {
    private final double radius;

    public Circulo(int radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * (radius * radius);
    }

    public String getNome(){
        return "Círculo";
    }
}
