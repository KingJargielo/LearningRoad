class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Exemplary thread");
        System.out.println("Descendant thread: " + t);
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Descendant thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Descendant thread has been interrupted.");
        }
        System.out.println("Exiting the descendant thread");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        NewThread nt = new NewThread();

        nt.t.start();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("The main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("The main thread has been interrupted.");
        }
        System.out.println("Exiting the main thread");
    }
}
