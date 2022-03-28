package mypack;

public class Balance1 {
    String name;
    double bal;

   public Balance1(String n, double b) {
       name = n;
       bal = b;
   }

   public void show1() {
       if (bal < 0)
           System.out.println("-->> ");
       System.out.println(name + ": " + bal + " zł");
   }
}
