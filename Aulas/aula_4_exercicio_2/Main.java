package aula_4_exercicio_2;

import java.util.ArrayList;
import java.util.List;

public class  Main {
    public static void main(String[] args) {
        ArrayList<FormaGeometrica> lista = new ArrayList<>();

        Retangulo retangulo = new Retangulo(5,3);

        Circulo circulo = new Circulo(5);

        Quadrado quadrado = new Quadrado(5,8);

        Triangulo triangulo = new Triangulo(5,6);

        Losango losango = new Losango(4,3);

        lista.add(retangulo);
        lista.add(circulo);
        lista.add(quadrado);
        lista.add(triangulo);
        lista.add(losango);

        for (FormaGeometrica formaGeometrica : lista) {
            System.out.println("A área do: " + formaGeometrica.getNome() + " é de: " + formaGeometrica.calculateArea());
        }
    }
}
