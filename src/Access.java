class Basic2 {
        int i;
        private int j;

        void setij(int x, int y) {
            i = x;
            j = y;
        }
    }
class Derivative2 extends Basic2 {
    int total;

    void sum() {
        total = i + j;
    }
}
class Access {
    public static void main(String[] args) {
        Derivative2 subObject = new Derivative2();

        subObject.setij(10,12);

        subObject.sum();
        System.out.println("Sum of basic's variables:" + subObject.total);
    }
}