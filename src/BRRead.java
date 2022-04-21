import java.io.*;

public class BRRead {
    public static void main(String[] args) throws Exception {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wpisz znaki, wpisanie 'q' spowoduje zakończenie programu.");

        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');

    }
}
