class RaceThread extends Thread {

    public RaceThread(String name) {
        super(name);
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                getName() + " -> Iteration : " + i
            );

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println(getName() + " finished the race!");
    }
}

public class RaceDemo {

    public static void main(String[] args) {

        RaceThread t1 = new RaceThread("Thread-1");
        RaceThread t2 = new RaceThread("Thread-2");
        RaceThread t3 = new RaceThread("Thread-3");

        
        t1.setPriority(Thread.MIN_PRIORITY);   
        t2.setPriority(Thread.NORM_PRIORITY);  
        t3.setPriority(Thread.MAX_PRIORITY);   

        
        t1.start();
        t2.start();
        t3.start();
    }
}
