import java.util.Scanner;
class reverseAString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.next();
        char[] arr = word.toCharArray();
        System.out.println(arr.length);

        for(int i = arr.length-1 ; i >=0; i--){
            System.out.print(arr[i]);
        }
    }
}