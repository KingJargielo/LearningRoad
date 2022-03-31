class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Another version of callback() method");
        System.out.println("p squared is " + (p*p));
    }
}
