public class ProstyPortalGra {
    public static void main(String[] args) {
        int iloscRuchow = 0;

        PomocnikGry pomocnik = new PomocnikGry();
        ProstyPortal portal = new ProstyPortal();

        int liczbaLosowa = (int) (Math.random() * 5);

        int[] polozenie = {liczbaLosowa, liczbaLosowa + 1, liczbaLosowa + 2};
        portal.setPolaPolozenia(polozenie);
        boolean czyIstnieje = true;

        while (czyIstnieje) {
            String pole = pomocnik.pobierzDaneWejsciowe("Podaj liczbę" +
                    " od 0 do 6");

            String wynik = portal.sprawdz(pole);

            iloscRuchow++;

            if (wynik.equals("zatopiony")) {
                czyIstnieje = false;
                System.out.println(iloscRuchow + " ruchów");
            }
        }
    }
}
