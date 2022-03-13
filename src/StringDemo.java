public class StringDemo {
    public static void main(String[] args) {
        String str1 = new String("Łańcuchy znaków w Javie są obiektami.");
        String str2 = "Możesz je tworzyć na wiele sposobów.";
        String str3 = new String(str2);
        String str4 = "Słowo";
        String str5 = "Słowo";


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

       boolean x;
        x = str4.equals(str5);
        System.out.println(x);
    }
}
