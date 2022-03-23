class A6 {
    int i, j;

    A6(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B6 extends A6 {
    int k;

    B6(int a, int b, int c) {
        super(a, b);
        c = k;
    }
        void show() {
            super.show();
            System.out.println("k: " + k);
        }

}

public class Override2 {
    public static void main(String[] args) {
        B6 subObj = new B6(1, 2, 3);

        subObj.show();
    }

}
