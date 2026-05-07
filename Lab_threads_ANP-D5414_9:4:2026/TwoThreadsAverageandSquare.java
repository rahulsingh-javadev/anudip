class AverageThread extends Thread{
    public void run(){
        int sum = 0;

        for(int i = 0 ; i < 10; i++){
            sum = sum + i;
        }
        double avg = sum / 10.0;
        System.out.println("Average of first 10 numbers = "+avg);
    }
}

class SquareThread extends Thread{ 
        int[] arr = {1, 20, 50, 15, 30};
    
    public void run(){
        System.out.println("Squares of array elements:");
        for(int num : arr){
            System.out.println("Square of " + num + " = " + (num * num));
        }
    }
}

public class TwoThreadsAverageandSquare {
    public static void main(String[] args) {

        AverageThread t1 = new AverageThread();
        SquareThread t2 = new SquareThread();

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
    }
    
}