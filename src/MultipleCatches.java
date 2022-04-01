public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
           int b = 42 / a;
            int c[] = { 1 };
            int d = c[88];
        } catch (ArithmeticException e) {
            System.out.println("Dividing by zero: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of limits: " + e);
        }
        System.out.println("After try and catch blocks");
    }
}
