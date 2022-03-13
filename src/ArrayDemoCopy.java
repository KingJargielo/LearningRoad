public class ArrayDemoCopy {
    public static void main(String[] args) {
//        long[] Table = new long[31];
//        int i;
//        long j = 1, k = 2;

//        for (i = 0; i < 32; i++) {
//            Table[i] = j;
//            j *= 2;
//        }
//        for (i = 0; i < 32; i++) {
//            System.out.println("Element tablicy o indeksie [" + i + "] to: " +
//                    Table[i]);
//        }
        System.out.println("\nPojemność zmiennej typu long to: 2^31 czyli ");

 /*       int i = 1;
        int result, e;
        for (j = ; j < 32 ; j++) {*/
/*            for (int e=0; e < 1; e--) {
                k = 1;
            }*/
//            k *= 2;
//            System.out.println(k);

        long[] Table = new long[65];
        long result = 1, j; /*e,*/
        int i;
                for (i = 1; i < 64; i++) {
//                result = 1;
            result *= 2;
            j = result;
            if (i == 63) j--;
            Table[i] = j;


              /*  for (e = i; e >= 1; e--) {
                    result *=2;*/
//                    if (e%7 == 0) System.out.println();

//                }
            System.out.println(j);
            System.out.println(Table[i]);
            System.out.println();
        }
        System.out.println(Table[64]);
    }
}
