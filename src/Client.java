public class Client implements Callback{
    public void callback(int p) {
        System.out.println("Induction of callback() with value in " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Interface developed by class " + " can contains its " +
                "own methods.");
    }
}
