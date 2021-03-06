class Queue {
    char[] q;
    int putloc, getloc;

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" -- Kolejka pełna.");
            return;
        }

        q[putloc++] = ch;
    }

    char get() {
        if (getloc == putloc) {
            System.out.println(" -- Kolejka pusta");
            return (char) 0;
        }

        return q[getloc++];

    }
}


public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Używam kolejki bigQ do przechowywania alfabetu.");

        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        System.out.print("Zawartość kolejki bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Używam kolejki smallQ do wygenerowania błędów.");
        for (i = 0; i < 5; i++) {
            System.out.print("Próbuję umieścić w kolejce znak " + (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        System.out.print("Zawartość kolejki smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();

            if (ch != (char) 0) System.out.print(ch);
        }
    }
}
