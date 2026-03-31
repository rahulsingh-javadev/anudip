import java.util.*;

public class bankAccount {
    static int size = 10;
    static String[] name = new String[size];
    static String[] accountNo = new String[size];
    static int[] balance = new int[size];
    static int idx = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("1 -> Add New Account \n2 -> Account Details \n3 -> Amount Deposit \n4 -> Amount Withdraw \n5 -> Exit \n Select Option:");
            int select = sc.nextInt();
            switch(select){
                case 1:
                    addNewAccount(sc);
                    break;
                case 2:
                    searchAccountNo(sc);    
                    break;
                case 3:
                    deposite(sc);
                    break;
                case 4:
                    withdraw(sc);
                    break;
                case 5:
                    System.out.println("Thank You");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        } 
    }  
    static void addNewAccount(Scanner sc){
        if(idx >= size){
            System.out.println("Increase the size of array");
            return;
        }
        System.out.println("Enter Name:");
        sc.nextLine();
        String n = sc.nextLine();

        System.out.println("Enter Phone Number (Account No):");
        String no = sc.next();
        for(int i = 0; i < idx; i++){
            if(accountNo[i].equals(no)){
                System.out.println("Account already exists! Try different number.");
                return;
            }
        }
        System.out.println("Enter Balance:");
        int bal = sc.nextInt();

        name[idx] = n;
        accountNo[idx] = no;
        balance[idx] = bal;

        idx++;
        System.out.println("Account Added SucessFully");
    }
    static void searchAccountNo(Scanner sc){
        System.out.println("Enter Phone No");
        String no = sc.next();
        for(int i = 0; i < idx; i++){
            if(accountNo[i].equals(no)){
                System.out.println("Name is "+name[i]);
                System.out.println("Account Number is "+accountNo[i]);
                System.out.println("Account Balance is "+balance[i]);
                return;
            }
        }
        System.out.println("Account Not Found");
        System.out.println("1 -> Exit \n2-> Do you want to create new account ");
        System.out.println("Select Options");
        int select = sc.nextInt();
        if(select == 2){
            sc.nextLine();
            addNewAccount(sc);
        }  
    }
    static void withdraw(Scanner sc){
    System.out.println("Enter Account Numbers");
    String no = sc.next();
    for(int i = 0; i < idx; i++){
        if(accountNo[i].equals(no)){
            System.out.println("Enter Amount");
            int amount = sc.nextInt();
            if(amount <= balance[i]){
                balance[i] -= amount;
                System.out.println("Remaning Balance is "+ balance[i]);
            }else{
                System.out.println("InSufficient Balance");
            }
            return;
        }
    }
    System.out.println("Account Not Found");
    }
    static void deposite(Scanner sc){
        System.out.println("Enter Account Number");
        String no = sc.next();
        for(int i = 0; i < idx; i ++){
            if(accountNo[i].equals(no)){
                System.out.println("Enter Deposite Amount");
                double amount = sc.nextDouble();
                balance[i] += amount;
                System.out.println("Remaning Balance is 5"+ balance[i]);
                return;
            }
        }
        System.out.println("Account Not Found");
    }
}
