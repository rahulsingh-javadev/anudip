package Bank;
public class BankAccount {
    private int balance;
    protected String accountType;
    String Branch;
    public String BankName;

    // public void setBalance(int b){
    //     balance = b;
    // }

    public int getBalance(){
        return balance;
    }

   public  void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance! Withdrawal failed.");
        }
    }

    // public void ActualBalance(int balance){
    //     System.out.println("Updated Balance = "+balance);
    // }
}