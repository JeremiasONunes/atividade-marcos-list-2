package exercicio3;

/*Crie uma classe chamada Retangulo que tenha os atributos base e altura. 
 * Crie também um método para calcular a área do retângulo.
 */

public class Rectangle {
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return base * height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}











