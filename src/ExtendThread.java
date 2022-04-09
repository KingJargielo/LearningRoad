class NewThread2 extends Thread {

    NewThread2 () {
        super("Exemplary thread");
        System.out.println("Descendant thread: " + this);
    }

    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Descendant thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Exiting the descendant thread");
        }
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        NewThread2 nt = new NewThread2();

        nt.start();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("The main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("The main thread has been interrupted");
        }
        System.out.println("Exiting the main thread");
    }
}
