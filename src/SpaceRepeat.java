public class SpaceRepeat {
    public static void main(String[] args)
        throws java.io.IOException {
        char ch;
        int i = 0;
        System.out.println("Aby zakończyć działanie pętli do-while wciśnij \".\"");
        do {
            ch = (char) System.in.read();
            if (ch == ' ' ) i++;
        } while (ch != '.');
        System.out.println("Ilość wciśnietych spacji: " + i);
    }
}
