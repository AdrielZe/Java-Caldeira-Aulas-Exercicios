package aula_5_exercicio_2;

public class Retangulo extends FormaGeometrica{
    private final double base;
    private final double height;

    public Retangulo(double base,double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return this.base * this.height;
    }
}
