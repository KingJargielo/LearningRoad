class Box {
    double width;
    double height;
    double depth;

    Box (Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box () {
        width = -1;
        height = -1;
        depth = -1;
    }
    Box (double len) {
        width = height = depth = len;
    }
    double volume () {
        return width * height * depth;
    }
}
class BoxWeight extends Box {
    double weight;

    BoxWeight (double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 30, 40.5);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.75);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1: " + vol);
        System.out.println("Weight of mybox1: " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of mybox2: " + vol);
        System.out.println("Weight of mybox2: " + mybox2.weight);
    }
}
