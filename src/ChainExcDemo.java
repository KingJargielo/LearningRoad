public class ChainExcDemo {
    static void demoproc() {
        NullPointerException e =
                new NullPointerException("The highest level");

        e.initCause(new ArithmeticException("Reason"));

        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Intercepted: " + e);

            System.out.println("Original reason: " + e.getCause());
        }
    }
}
