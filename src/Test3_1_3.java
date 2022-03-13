public class Test3_1_3 {
    public static void main(String[] args)
        throws java.io.IOException {
            char ch, space = ' ', exit ='.';
            int i;
            for(;(char) System.in.read()!=exit;) {
            ch = (char) System.in.read();
            if(ch==space) {

                for(i=1; ; i++) {
                    System.out.println("Nacisnąłeś spację " + i + " razy.");
                }
            } else break;
        }
    }
}
