public class Test3_1_1 {
    public static void main(String[] args)
            throws java.io.IOException {

        char exit = '.', space = ' ', ignore;
        int i;
        do {
            ignore = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            for (i = 1; ignore != exit ; i++) {
                if((ignore == space)) System.out.println("Naciśnięto spację " + i + " razy.");
            }
        } while (ignore != exit);


    }
}
