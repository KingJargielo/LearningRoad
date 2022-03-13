public class BubbleCopy {
    public static void main(String[] args) {
        int table [] = {888, 546, -58, 2095, -233566, 345, 3560, -2366, 948986, -94595};
        int a, b, t, size = 10;

        for (a = 1; a < 10; a++) {
            for (b=0; b <= 8; b++) {
                if (table[b] > table[b+1]) {
                    t = table[b+1];
                    table[b+1] = table[b];
                    table[b] = t;

                }

            }

        }

        for (int i = 0; i <10; i++) System.out.println(table[i] + " ");
    }
}
