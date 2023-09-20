package aula_4_exercicio_2;

public class Quadrado extends FormaGeometrica{
    private final double base;
    private final double height;

    public Quadrado(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return (this.base * this.height);
    }
}
