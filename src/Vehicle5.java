public class Vehicle5 {
    int passengers;
    int fuelcap;
    double lkm;

    int range() {
        return (int) (fuelcap / lkm * 100);
    }

    double fuelneeded(int km) {
        return (double) km / 100 * lkm;
    }
}
class CompFuel {
    public static void main(String[] args) {
        Vehicle5 minivan = new Vehicle5();
        Vehicle5 sportscar = new Vehicle5();
        double liters;
        int dist = 252;

        minivan.passengers = 7;
        minivan.fuelcap = 65;
        minivan.lkm = 9.1;

        sportscar.passengers = 2;
        sportscar.fuelcap = 55;
        sportscar.lkm = 12.5;

        liters = minivan.fuelneeded(dist);

        System.out.println("\nAby przejechać " + dist + " kilometrów, minivan" +
                " potrzebuje " + liters + " litrów paliwa. ");

        liters = sportscar.fuelneeded(dist);

        System.out.println("\nAby przejechać " + dist + " kilometrów, auto " +
                "sportowe potrzebuje " + liters + " litrów paliwa. ");
    }
}