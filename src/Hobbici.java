public class Hobbici {
String imie;

    public static void main(String[] args) {

        Hobbici[] h = new Hobbici[3];

        int z = 0;
        while(z < 3) {

            h[z] = new Hobbici();
            String imie;
            h[z].imie = "Bilbo";
            if (z == 1){
                h[z].imie = "Frodo";
            }
            if (z == 2) {
                h[z].imie = "Sam";
            }

            System.out.println(h[z].imie + " jest dobrym imieniem dla hobbita");
            z = z + 1;
        }
    }
}
