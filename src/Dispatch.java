class C {
    void callme() {
        System.out.println("callme() method of C class");
    }
}

class D extends C {
    void callme() {
        System.out.println("callme() method of D class");
    }
}

class E extends C {
    void callme() {
        System.out.println("callme() method of E class");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        C c = new C();
        D d = new D();
        E e = new E();
        C z;

        z = c;
        z.callme();

        z = d;
        z.callme();

        z = e;
        z.callme();
    }
}
