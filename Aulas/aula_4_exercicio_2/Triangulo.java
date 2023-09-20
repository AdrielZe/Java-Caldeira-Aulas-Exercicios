package aula_4_exercicio_2;

public class Triangulo extends FormaGeometrica{
    private final double base;
    private final double height;

    public Triangulo(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return (this.base * this.height) / 2;
    }
}
