public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("Inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("finally from procA");
        }
    }

    static void procB() {
        try {
            System.out.println("Inside procB");
            return;
        } finally {
            System.out.println("finally from procB");
        }
    }

    static void procC() {
        try {
            System.out.println("Inside procC");
        } finally {
            System.out.println("finally from procC");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Catch of exception");
        }
        procB();
        procC();
    }
}
