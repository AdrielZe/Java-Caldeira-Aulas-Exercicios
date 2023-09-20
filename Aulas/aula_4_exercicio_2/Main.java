package aula_4_exercicio_2;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5,3);
        System.out.println("Área do retângulo é de: " + retangulo.calculateArea());

        Circulo circulo = new Circulo(5);
        System.out.println("Área do círculo é de: " + circulo.calculateArea());

        Quadrado quadrado = new Quadrado(5,8);
        System.out.println("Área do quadrado é de: " + quadrado.calculateArea());

        Triangulo triangulo = new Triangulo(5,6);
        System.out.println("Área do quadrado é de: " + triangulo.calculateArea());

        Losango losango = new Losango(4,3);
        System.out.println("Área do losango é de: " + losango.calculateArea());
    }
}
