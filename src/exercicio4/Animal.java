package exercicio4;

/*Crie uma classe chamada Animal que tenha os atributos nome e especie. 
 * Crie também um método para imprimir o nome e a espécie do animal.
 */

public class Animal {
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }
}
