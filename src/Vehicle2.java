//class Vehicle2 {
//    int passengers;
//    int fuelcap;
//    double lkm;
//
//  }

class Vehicle2 {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 65;
        minivan.lkm = 9.1;

        sportscar.passengers = 2;
        sportscar.fuelcap = 55;
        sportscar.lkm = 12.5;

        range1 = (int) (minivan.fuelcap / minivan.lkm * 100);
        range2 = (int) (sportscar.fuelcap / sportscar.lkm * 100);

        System.out.println("\nMinivan przewozi " + minivan.passengers + " osób" +
                " na odległość do " + range1 + " kilometrów.");
        System.out.println("\nAuto sportowe przewozi " + sportscar.passengers +
                " osoby na odległość do " + range2 + " kilometrów.");



    }
}
