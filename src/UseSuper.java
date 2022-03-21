class A1 {
    int i;
}
class B1 extends A {
    int i;

    B1(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i from basic class: " + super.i);
        System.out.println("i from derivative class: " + i);
    }
}
class UseSuper {
    public static void main(String[] args) {
        B1 subObj = new B1(1, 2);

        subObj.show();
    }
}

