public interface MyIF {
    int getNumber();

    default String getString() {
        return "Łańcuch domyślny";
    }
}
