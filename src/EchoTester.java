class Echo {
    int ilość = 0;
    void witaj() {
        System.out.println("sieeeeeemasz...");
    }
}

public class EchoTester {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;
        while (x < 4) {
            e1.witaj();
            e1.ilość = e1.ilość + 1;
            if (x == 3) {
                e2.ilość = e2.ilość + 1;
            }
            if (x >1 ) {
                e2.ilość = e2.ilość + e1.ilość;
            }
            x = x + 1;
        }
            System.out.println(e2.ilość);

    }
}
