import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TicketCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        Queue<String> customers = new LinkedList<>();

        
        System.out.print("Enter number of customers (minimum 4): ");
        int n = sc.nextInt();
        sc.nextLine();

        
        if (n < 4) {
            System.out.println("Please enter at least 4 customers.");
            return;
        }

        
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter customer name " + i + ": ");
            String name = sc.nextLine();
            customers.add(name);
        }

        
        System.out.println("\nCustomers in Queue:");
        System.out.println(customers);

        int servedCount = 0;

        
        while (!customers.isEmpty()) {

            String servedCustomer = customers.poll();

            System.out.println("\nServing Customer: " + servedCustomer);

            servedCount++;

            
            if (servedCount == 2) {
                System.out.println("\nRemaining Customers in Queue:");
                System.out.println(customers);
            }
        }

        System.out.println("\nAll customers have been served.");
        System.out.println("Queue is now empty.");

        sc.close();
    }
}