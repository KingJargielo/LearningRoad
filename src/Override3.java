class A7 {
    int i, j;

    A7(int a, int b) {
        i = a;
        j = b;
    }

    void show () {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B7 extends A6 {
    int k;

    B7(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}

public class Override3 {
    public static void main(String[] args) {
        B7 subObj = new B7(1, 2, 3);

        subObj.show("This is k value: ");
        subObj.show();
    }
}
