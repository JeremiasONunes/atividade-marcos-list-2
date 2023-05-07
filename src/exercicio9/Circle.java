package exercicio9;

/*Crie uma classe chamada Circulo que tenha o atributo raio. 
 * Crie também um método para calcular a área do círculo.
 */

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
