abstract class F {
    abstract void callme();

    void callmetoo() {
        System.out.println("This is the method");
    }
}

class G extends F {
    void callme() {
        System.out.println("Implementation of callme() method from F class");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        G g = new G();

        g.callme();
        g.callmetoo();

    }
}
