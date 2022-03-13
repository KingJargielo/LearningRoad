public class Test3_8 {
    public static void main(String[] args) {
        double result;

        for (double i = 0.0; i <10; i++) {
            System.out.print(i + " ");
            if((i%2) == 0) {
                result = i%2;
                System.out.println(result);
                continue;
            }
            System.out.println();
        }
    }
}
