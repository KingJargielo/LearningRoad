class H {
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

class I implements H.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false: true;
    }
}
public class NestedIFDemo {
    public static void main(String[] args) {

        H.NestedIF nif = new I();

        if(nif.isNotNegative(10))
            System.out.println("Number 10 is not negative ");
        if(nif.isNotNegative(-12))
            System.out.println("It will be not displayed ");
    }
}
