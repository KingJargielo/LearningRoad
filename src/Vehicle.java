public class Vehicle {
    int passengers;
    int fuelcap;
    double lkm;

//    void range() {
//        System.out.println("Zasięg (km): " + (int) (fuelcap / lkm * 100));
//    }
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 65;
        minivan.lkm = 9.1;

        range = (int) (minivan.fuelcap / minivan.lkm * 100);

        System.out.println("\nMinivan przewozi " + minivan.passengers + " osób na " +
                "odległość do " + range + " kilometrów.");
    }
}

