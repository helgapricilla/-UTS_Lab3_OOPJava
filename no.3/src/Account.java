public class Account {
    private String id, name;
    private double balance=0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public void credit(double amount){
        balance += amount;
    }
    public double debit(double amount){
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public double transferTo(Account another, double amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
