public class StrOpsCopy {
    public static void main(String[] args) {
        String str1 = "W programowaniu aplikacji internetowych Java jest numerem jeden wsród aplikacji.";
        String str2 = new String(str1);
        String str3 = "Łańcuchy w Javie mają spore możliwości";
        String str4 = "Abcde Abcde Abcde";
        String str5 = "W";
        String str6 = "Ł";
        int result, idx;
        char ch;

        System.out.println("Długość łańcucha str1:" + str1.length());

        for (int i = 0; i < str1.length(); i++)
            System.out.print(str1.charAt(i));
        System.out.println();

        if (str1.equals(str2))
            System.out.println("str1 jest taki sam jak str2");
        else System.out.println("str1 jest różny od str2");
        int a;

        a = str5.length();
        System.out.println(a);

        int b;
        b = str6.length();
        System.out.println(b);

        result = str5.compareTo(str6);
        System.out.println(result);

        idx = str2.indexOf("aplikacji");
        System.out.println(idx);
        idx = str2.lastIndexOf("aplikacji");
        System.out.println(idx);
    }
}
