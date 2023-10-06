package aula_3_circulo;

public class Circle {
    private double radius;
    private double pi = 3.14;
    private int xPosition;
    private int yPosition;

    public Circle(double radius){
        if(radius > 0){
            this.radius = radius;
        } else {
            System.out.println("O raio deve ter um valor positivo!");
        }
    }

    public Circle(int x, int y,double radius){
        Circle circle = new Circle(radius);
        circle.xPosition = x;
        circle.yPosition = y;
    }

    public double calculateCircleArea(double radius){
        return (pi * (radius * radius));
    }

    public double calculateCircleCircunference(double radius){
        return ((2*pi) * radius);
    }

    public double calculateCircleDiameter(){
        return (2 * radius);
    }

    public String toString(){
        return "Raio: " + this.radius + " - Comprimento: " + calculateCircleArea(this.radius) + " - Área: " + calculateCircleCircunference(this.radius);
    }

    public boolean verifyEqual(Circle circle1){
        return this.radius == circle1.getRadius();
    }

    public double calculateShadowedArea(Circle circle){
       if(this.radius == circle.getRadius()){
           System.out.println("O raio dos círculos devem ser diferentes para que haja uma área sombreada.");
           return 0;
       } else {
           double circleArea = (pi * (this.radius * this.radius));
           double circle2Area = (pi * (circle.getRadius() * circle.getRadius()));
           if ( this.radius > circle.getRadius()) return circleArea - circle2Area;
           else return circle2Area - circleArea;
       }
    }




    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0){
            System.out.println("O raio deve ser um valor positivo!");
        } else {
            this.radius = radius;
        }
    }


}
