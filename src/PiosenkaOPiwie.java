public class PiosenkaOPiwie {
    public static void main(String[] args) {
        int iloscButelek = 99;
        String slowo = "bottles";
        while (iloscButelek > 0) {
            if (iloscButelek == 1) {
                slowo = "bottle";
            }
            System.out.print(iloscButelek + " " + slowo + " of beer on the wall, ");
            System.out.println(iloscButelek + " " + slowo + " of beer.");
            System.out.print("Take one down and ");
            System.out.print("pass it around, ");
            iloscButelek = iloscButelek - 1;

            if (iloscButelek > 0) {
                System.out.println(iloscButelek + " " + slowo + " of beer on the" +
                        " wall.\n");
            } else {
                System.out.println("no more bootles of beer on the wall");
            }
        }
    }
}
