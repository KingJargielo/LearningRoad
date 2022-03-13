public class Vehicle6 {
    int passengers;
    int fuelcap;
    double lkm;

    Vehicle6(int p, int f, double l) {
        passengers = p;
        fuelcap = f;
        lkm = l;
    }

    int range() {
        return (int) (fuelcap / lkm * 100);
    }

    double fuelneeded(int km) {
        return (double) km / 100 * lkm;
    }
}

class VehConsDemo {
    public static void main(String[] args) {
        Vehicle6 minivan = new Vehicle6(7,65,9.1);
        Vehicle6 sportscar = new Vehicle6(2,55,12.5);
        double liters;
        int dist = 252;

        liters = minivan.fuelneeded(dist);

        System.out.println("\nAby przejechać " + dist + " kilometrów, minivan " +
                "potrzebuje "+ liters + " litrów paliwa.");

        liters = sportscar.fuelneeded(dist);

        System.out.println("\nAby przejechać " + dist + " kilometrów, auto sportowe" +
                " potrzebuje " + liters + " litrów paliwa.");
    }
}

