public class StringSwitch {
    public static void main(String[] args) {

        String command = "cancel";

        switch (command) {
            case "connect":
                System.out.println("Łączę");
                break;
            case "cancel":
                System.out.println("Przerywam");
                break;
            case "disconnect":
                System.out.println("Rozłączam");
                break;
            default:
                System.out.println("Błędne polecenie");
                break;
        }
    }
}
