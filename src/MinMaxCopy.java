public class MinMaxCopy {
    public static void main(String[] args) {
        int min, max, i;
        int Table[] = {1, 4, 7, 54, 345, 490689};
        min = max = Table[0];
        for (i = 1; i < 6; i++) {
            if (Table[i] > Table[0]) max = Table[i];
            else min = Table[i];

        }
        System.out.println("Najmniejsza i największa wartość to: " + min + " "
                + max);
    }
}
