package  Bank;


public class Showdata{
         
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        // b1.setBalance(2000);
        b1.accountType = "Savings";   
        b1.Branch = "Delhi";          
        b1.BankName = "SBI";  
        
        b1.deposit(500);
        b1.withdraw(300);

        
        System.out.println("Bank Name: " + b1.BankName);
        System.out.println("Branch: " + b1.Branch);
        System.out.println("Account Type: " + b1.accountType);
        System.out.println("Balance: " + b1.getBalance());

        
        // b1.deposit(500);
        // b1.withdraw(300);

        // b1.ActualBalance(b1.getBalance());
        //System.out.println("Updated Balance: " + b.getBalance());
        
    }
}