package exercicio6;

/*Crie uma classe chamada Triangulo que tenha os atributos base e altura. 
 * Crie também um método para calcular a área do triângulo.
 */

public class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}