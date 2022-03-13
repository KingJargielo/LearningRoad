
public class Vehicle4 {
    int passengers;
    int fuelcap;
    double lkm;

    int range() {
        return (int) (fuelcap / lkm * 100);
    }
}

class RetMeth {
    public static void main(String[] args) {
        Vehicle4 minivan = new Vehicle4();
        Vehicle4 sportscar = new Vehicle4();

        int range1, range2;

        minivan.passengers = 2;
        minivan.fuelcap = 65;
        minivan.lkm = 9.1;

        sportscar.passengers = 2;
        sportscar.fuelcap =  55;
        sportscar.lkm = 12.5;

        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println("\nMinivan przewozi " + minivan.passengers +
                " osób na odległość do " + range1 + " kilometrów.");

        System.out.println("\nAuto sportowe przewozi " + sportscar.passengers +
                " osoby na odległość do " + range2 + " kilometrów.");
    }
}