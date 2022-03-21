class Box3 {
    private double width;
    private double height;
    private double depth;

    Box3(Box3 obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box3() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box3(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
class BoxWeight3 extends Box3 {
        double weight;

        BoxWeight3(BoxWeight3 obj) {
            super(obj);
            weight = obj.weight;
        }

        BoxWeight3(double w, double h, double d, double m) {
            super(w, h, d);
            weight = m;
        }

        BoxWeight3() {
            super();
            weight = -1;
        }

        BoxWeight3(double len, double m) {
            super(len);
            weight = m;

        }
}
class Shipment extends BoxWeight3 {
    double cost;

    Shipment(Shipment obj) {
    super(obj);
    cost =  obj.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(1, 2, 3, 4, 5);
        Shipment shipment2 = new Shipment(0.1, 0.2, 0.3, 0.4, 0.5);

        double vol;

        vol = shipment1.volume();
        System.out.println("Volume of shipment1 is " + vol);
        System.out.println("Weight of shipment1 is " + shipment1.weight);
        System.out.println("Shipping cost of shipment1 is " + shipment1.cost + "PLN");
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Volume of shipment2 is " + vol);
        System.out.println("Weight of shipment2 is " + shipment2.weight);
        System.out.println("Shipping cost of shipment1 is " + shipment2.cost + "PLN");
        System.out.println();
    }
}

