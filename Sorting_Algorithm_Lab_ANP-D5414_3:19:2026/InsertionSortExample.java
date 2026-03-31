import java.util.*;

public class InsertionSortExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.println("Pass " + i + ": " + Arrays.toString(arr));
        }

        System.out.println("Final Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}