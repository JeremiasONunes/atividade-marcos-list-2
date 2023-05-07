package exercicio2;

/*Crie uma classe chamada ContaBancaria que tenha os atributos saldo e titular. 
 * Crie também métodos para depositar e sacar dinheiro da conta.
 */
public class BankAccount {
    private double balance;
    private String holder;

    public BankAccount(double balance, String holder) {
        this.balance = balance;
        this.holder = holder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }
}