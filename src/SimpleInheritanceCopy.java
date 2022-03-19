class Basic {
        int i, j;

        void showVariableBasic() {
            System.out.println("Variable i and j: " + i + " " + j);
        }
    }
    class Derivative extends Basic {
        int k;

        void showVariableDerivative() {
            System.out.println("Variable k: " + k);
        }
        void sum() {
            System.out.println("i+j+k:" + (i+j+k));
        }
    }

class simpleInheritanceCopy {
    public static void main(String[] args) {
        Basic superObject = new Basic();
        Derivative subObject = new Derivative();

        superObject.i = 10;
        superObject.j = 20;
        System.out.println("superObject contains: ");
        superObject.showVariableBasic();
        System.out.println();

        subObject.i = 7;
        subObject.j = 8;
        subObject.k = 9;
        System.out.println("subObject contains: ");
        subObject.showVariableBasic();
        subObject.showVariableDerivative();
        System.out.println();

        System.out.println("Sum of i, j and k in subObject: ");
        subObject.sum();

    }
}