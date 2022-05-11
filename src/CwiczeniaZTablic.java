public class CwiczeniaZTablic {
    public static void main(String[] args) {
        int[] example = new int[10];
        int[] sample;
        sample = new int[10];
            for (int number = 0; number < 10; number++) {
                sample[number] = number;
                System.out.println(sample[number]);
            }
        example = new int[]{55, 99, -12, -400, 585, 9, -1258, 88, 6, -1};
            int min, max;
            for (int i = 0; i < 10; i++) {
                System.out.println(example[i]);

            }
            for (int i = 0; i < 10; i++) {
                min = max = example[0];
                if (max < example[i]) max = example[i];
                if (min > example[i]) min = example[i];
                System.out.println(min);
                System.out.println(max);
            }
    }

}
