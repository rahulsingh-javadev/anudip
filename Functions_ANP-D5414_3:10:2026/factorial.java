import java.util.*;
public class factorial {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter The Number Which you want to calculate factorial");
        int num = Sc.nextInt();
        System.out.println("Factorial of "+num+" is "+factorial(num));
        
    }


    static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    
}
