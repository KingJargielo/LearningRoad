public class Guess3 {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch, answer = 'K';

        System.out.println("Pomyślałem literę z przedziału od A do Z.");
        System.out.print("Spróbuj ją odgadnąć: ");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println("** Dobrze! **");
        else {
            System.out.print("Niestety trafiłeś ");
            if (ch < answer) System.out.println("zbyt nisko");
            else System.out.println("za wysoko");
        }
    }
}
