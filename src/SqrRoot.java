public class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;

        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);

            System.out.println("Pierwiastek kwadratowy z " + num + " wynosi " +
                    sroot);
            rerr = num - (sroot * sroot);
            System.out.println("Błąd zaokrąglenia wynosi " + rerr);
            System.out.println();
        }
    }
}
