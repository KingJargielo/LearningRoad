public class Scope {
    public static void main(String[] args) {
        int x;

        x = 10;
        if (x == 10) {
            int y = 20;

            System.out.println("x i y: " + x + " " + y);
            x = y * 2;
        }
//        y = 100;
        x = 384 ;
        byte b;
        b = (byte) x;

                System.out.println("x wynosi " + x + " a x wpakowany w byte b wynosi:" +
                        + b);
    }
}
