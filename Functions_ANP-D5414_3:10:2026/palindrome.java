import java.util.Scanner;

public class palindrome {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        System.out.println("Number is Palindrome "+checkPalindrome(num));
    }

    static boolean checkPalindrome(int n){
        int current = n;
        int reverse = 0;;

        while(n > 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n /10;
        }
        return current == reverse;
    }
    
}
