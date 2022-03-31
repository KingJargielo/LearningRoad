
interface X {
    void meth1();
    void meth2();
}

interface Y extends X {
    void meth3();
}

class MyClass3 implements Y {
    public void meth1() {
        System.out.println("Implementation of meth1()");
    }

    public void meth2() {
        System.out.println("Implementation of meth2()");
    }

    public void meth3() {
        System.out.println("Implementation of meth3()");
    }
}

public class IfExtend {
    public static void main(String[] args) {
        MyClass3 obj = new MyClass3();

        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}
