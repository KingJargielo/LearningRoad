public class TwoDCopy {
    public static void main(String[] args) {
        int table[][] = new int[5][3];
        int v, h;

        for (v = 0; v < 5; v++) {
            for (h = 0; h < 3; h++) {
                table[v][h] = (v * 3) + h + 1;
                System.out.print(table[v][h] + " ");
            }
            System.out.println();
        }
    }
}
