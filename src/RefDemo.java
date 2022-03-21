public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Volume of weightbox: " + vol);
        System.out.println("Weight of weightbox: " + weightbox.weight);
        System.out.println();

        plainbox = weightbox;

        vol = plainbox.volume();
        System.out.println("Volume of plainbox: " + vol);

        System.out.println("Weight of plainbox object is: " /* + plainbox.weight*/);
    }
}
