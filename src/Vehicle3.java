public class Vehicle3 {
    int passengers;
    int fuelcap;
    double lkm;

    void range() {
        System.out.println("Zasięg (km): " + (int) (fuelcap / lkm * 100));
    }
}

class AddMeth {
    public static void main(String[] args) {
        Vehicle3 minivan = new Vehicle3();
        Vehicle3 sportscar = new Vehicle3();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 65;
        minivan.lkm = 9.1;

        sportscar.passengers = 2;
        sportscar.fuelcap = 55;
        sportscar.lkm = 12.5;

        System.out.println("Minivan przewozi " + minivan.passengers + " osób.");

        minivan.range();

        System.out.println("Auto sportowe przewozi " + sportscar.passengers +
                " osoby.");

        sportscar.range();

    }
}