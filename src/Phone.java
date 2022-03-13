public class Phone {
    public static void main(String[] args) {
        String numbers[][] = {
                {"Tomek", "555 545 654"},
                {"Józek", "835 693 392"},
                {"Elwira", "700 880 700"},
                {"Hilda", "555 666 777"}
        };
        int i;

        if (args.length != 1)
            System.out.println("Wywołanie: java Phone <imię>");
        else {
            for (i = 0; i < numbers.length; i++) {
                if (numbers[i][0].equals(args[0])) {
                System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                break;
            }
        }
        if (i == numbers.length)
            System.out.println("Brak imienia w książce.");
        }
    }
}
