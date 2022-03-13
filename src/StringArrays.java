public class StringArrays {
    public static void main(String[] args) {
        String strs[] = {"To", "jest", "tylko", "test."};

        System.out.println("Początkowa wartość tablicy: ");
        for (String s: strs)
            System.out.print(s + " ");
        System.out.println("\n");

        strs[1] = "był";
        strs[3] = "zwykły test!";

        System.out.println("Zmodyfikowana wartość tablicy: ");
        for (String s: strs)
            System.out.print(s + " ");


    }
}
