import java.util.Scanner;
import java.util.Stack;

public class UndoFeature {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        Stack<String> actions = new Stack<>();

        
        System.out.print("Enter number of actions: ");
        int n = sc.nextInt();
        sc.nextLine();

        
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter action " + i + ": ");
            String action = sc.nextLine();
            actions.push(action);
        }

        
        System.out.println("\nActions stored in stack:");
        System.out.println(actions);

        
        System.out.print("\nHow many actions do you want to undo? ");
        int undoCount = sc.nextInt();

        
        if (undoCount > actions.size()) {
            System.out.println("\nCannot undo " + undoCount +
                    " actions because only " + actions.size() +
                    " actions are available.");
        } else {

        
            System.out.println("\nUndoing actions:");

            for (int i = 1; i <= undoCount; i++) {

                String removedAction = actions.pop();

                System.out.println("Undone: " + removedAction);
            }
        }

        System.out.println("\nRemaining actions in stack:");
        System.out.println(actions);

        sc.close();
    }
}