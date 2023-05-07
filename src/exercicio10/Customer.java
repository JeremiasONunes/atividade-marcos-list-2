package exercicio10;

/*Crie uma classe chamada Cliente que tenha os atributos nome, endereco e telefone. 
 * Crie também um método para imprimir as informações do cliente.
 */

public class Customer {
    private String name;
    private String address;
    private String phone;

    public Customer(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void printCustomerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}