package Aula_5_exercicio_2;

public class Losango extends FormaGeometrica{
    private final double biggerDiagonal;
    private final double smallerDiagonal;

    public Losango(double biggerDiagonal, double smallerDiagonal){
        this.biggerDiagonal = biggerDiagonal;
        this.smallerDiagonal = smallerDiagonal;
    }

    @Override
    public double calculateArea(){
        return (this.biggerDiagonal * this.smallerDiagonal) / 2;
    }
}
