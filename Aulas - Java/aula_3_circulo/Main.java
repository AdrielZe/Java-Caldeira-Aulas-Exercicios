package aula_3_circulo;

public class Main {
    public static void main(String[] args) {
        Circle cirlce3 = new Circle(2,3,5);
        Circle circle = new Circle(2);
        Circle circle2 = new Circle(2);

        System.out.println(circle.verifyEqual(circle2));
        System.out.println(circle.calculateCircleArea(circle.getRadius()));
        System.out.println(circle);
    }
}
