package p2;

import java.util.Scanner;

public class Haiku {
    public static void main(String[] args) {
        Scanner scan = new Scanner("On a withered branch'" + "A crow has alighted.'" +
                                    "Nightfall in autumn.''" + "***" + "''Such a moon above,'" +
                                    "Like a tree cut at the root:'" + "he fresh cut is white.''" +
                                    "***" + "''How the river floods!'" + "A heron wanders on short legs,'" +
                                    "Knee-deep in the water.");

        //scan.useDelimiter("\\*\\*\\*");
        scan.useDelimiter("'");

        while (scan.hasNext()) {
            System.out.println(scan.next());
        }

        scan.close();
    }
}
