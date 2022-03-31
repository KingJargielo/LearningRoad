interface IntStack {
    void push(int item);
    int pop();

    default void clear() {
        System.out.println("The Clear() method has not been implemented.");
    }
}
