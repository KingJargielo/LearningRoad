class Box2 {
    private double width;
    private double height;
    private double depth;

    Box2(Box2 obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }
    Box2 (double len) {
        width = height = depth = len;
    }
    double volume() {
       return width * height * depth;
    }
}
class BoxWeight2 extends Box2 {
    double weight;

    BoxWeight2(Box2 obj) {
        super(obj);
    }
    
    BoxWeight2(BoxWeight2 obj) {
        super(obj);
        weight = obj.weight;
    }

    BoxWeight2(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
    BoxWeight2() {
        super();
        weight = -1;
    }
    BoxWeight2(double len, double m) {
        super(len);
        weight = m;
    }
}

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight2 mybox1 = new BoxWeight2(10, 20, 15, 34.5);
        BoxWeight2 mybox2 = new BoxWeight2(2, 3, 4, 0.75);
        BoxWeight2 mybox3 = new BoxWeight2();
        BoxWeight2 mycube1 = new BoxWeight2(3, 2);
        BoxWeight2 myclone1 = new BoxWeight2(mybox1);
        Box2 mycube2 = new Box2(2);
        Box2 mycone2 = new Box2(mycube2);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1: " + vol);
        System.out.println("Weight of mybox1: " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of mybox2: " + vol);
        System.out.println("Weight of mybox2: " + mybox2.weight);
        System.out.println();

        vol = mycube1.volume();
        System.out.println("Volume of mycube1: " + vol);
        System.out.println("Weight of mycube1: " + mycube1.weight);
        System.out.println();

        vol = myclone1.volume();
        System.out.println("Volume of myclone1: " + vol);
        System.out.println("Weight of myclone1:" + myclone1.weight);
        System.out.println();

        vol = mycube2.volume();
        System.out.println("Volume of mycube2: " + vol);
        System.out.println();

        vol = mycone2.volume();
        System.out.println("Volume of myclone2: " + vol);
        System.out.println();

        vol =  mybox3.volume();
        System.out.println("Volume of mybox3: " + vol);
        System.out.println();
    }
}
