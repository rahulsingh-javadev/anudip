import java.util.*;

public class primeNumberFunction {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        if(n == 1 || n % 2 == 0 ){
            System.out.println("Is Not a Prime Number");
        }
        else{
            System.out.println("Is a Prime Number");
        }
        System.out.println(primecheck(n));
    }

    static String primecheck(int n){
        if (n <= 1) return "Not Prime";

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return "Not Prime";
        }
        return "Prime";
    }
}
