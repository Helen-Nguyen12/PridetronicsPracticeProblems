import java.util.HashMap;

public class test {
    private double balance;
    public static void main(String[] args) {
    // Creates a new card with 10 dollars to start
    CreditCard card = new CreditCard(10);

    public test(double balance) {
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public double addMoney(double amount){
        this.balance = balance + 20.0;
        return this.balance;
    }
    public double removeMoney(double amount){
        this.balance = balance - 5.0;
        return this.balance;
    }
    // Prints the starting value of the card
    System.out.println("Money in Card:" + card.getBalance());

    // Removes 5 dollars from the card
    card.removeMoney(5);
    System.out.println("Money in Card after Removal:" + card.getBalance());

    // Adds 20 dollars to the card
    card.addMoney(20);
    System.out.println("Money in Card after Adding:" + card.getBalance());
    }
}
