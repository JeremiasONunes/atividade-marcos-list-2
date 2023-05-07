package exercicio8;

/*Crie uma classe chamada Funcionario que tenha os atributos nome, cargo e salario. 
 * Crie também um método para imprimir as informações do funcionário.
 */
public class Employee {
    private String name;
    private String title;
    private double salary;

    public Employee(String name, String title, double salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public void printEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Title: " + title);
        System.out.println("Salary: " + salary);
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }
}
