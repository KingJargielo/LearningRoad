class A2 {
    A2() {
        System.out.println("Constructor of A1 class");
    }
}

class  B2 extends A2 {
    B2() {
        System.out.println("Constructor of B1 class");
    }
}

class C2 extends B2 {
    C2 () {
        System.out.println("Constractor of C1 class");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        C2 c2 = new C2();
    }
}
