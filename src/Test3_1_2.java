public class Test3_1_2 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch;
        int i;

        System.out.println("Wprowadź znak, a następnie naciśnij ENTER: ");
        for (; ; ) {


            ch = (char) System.in.read();
            i = ch;

            System.out.println("Wprowadziłeś " + ch + " o numerze " + i);
        }
    }

}

