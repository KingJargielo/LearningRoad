public class ChangeLetter {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, ignore;
        int change = 0;
        System.out.println("Wpisz literę z klawiatury i zobacz czy "
                + "zostanie zmieniona jej wielkość: ");
        System.out.println("Wprowadź kropkę, by zakończyć");
        do {
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                change++;
            } else if (ch >= 'A' & ch <= 'Z') {
                ch += 32;
                change++;
            }
            System.out.println(ch);

        } while (ch != '.');
        System.out.println("Ilość dokonanych konwersji " + change);
    }
}
