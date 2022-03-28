package mypack;

class Balance {
    String name;
    double bal;

    Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if(bal<0)
            System.out.print("-->> ");
        System.out.println(name + ": " + bal + " zł");
    }
}
public class AccountBalance {
    public static void main(String[] args) {
        Balance[] current = new Balance[3];

        current[0] = new Balance("K.J. Fielding",123.12);
        current[1] = new Balance("Wilhelm Tell", 164.05);
        current[2] = new Balance("Michael Jackson", -12.33);

        for (int i=0; i<3; i++) current[i].show();
    }
}

