public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Catching a general exception");
        }
//        catch (ArithmeticException e) {
//            System.out.println("The program will never do this");
        }
    }
//}
