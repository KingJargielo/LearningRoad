public class Test3_1_4 {
    public static void main(String[] args)
        throws java.io.IOException {
        char ignore;
        int i;

        for (;;) {

            ignore = (char) System.in.read();
            for (i = 1; (char) System.in.read() == ' ' ; i++) {
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
                if (ignore == ' ')
                    System.out.println("Naciśnięto spację " + i + " razy");
            }

        }
    }
}
