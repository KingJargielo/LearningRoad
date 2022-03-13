public class CLDemo {
    public static void main(String[] args) {
        System.out.println("Programowi podczas wywołania przekazano " +
                args.length + " argumenty.");

        System.out.println("Oto one: ");
        for (int i = 0; i < args.length; i++)
            System.out.println("arg[" + i + "]: " + args[i]);
    }
}
