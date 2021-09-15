
// bilangan
import java.util.*;

public class bilangan {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = 2147483646;
        System.out.println("Faktor dari nilai :" + a);
        int b = 0;
        int curfactor = 0;
        int maxfactor = 100;
        for (int z = 0; z <= a; z++) {
            b++;
            if (curfactor < maxfactor) {
                if (a % b == 0) {
                    System.out.print(b + " ");
                    curfactor++;
                }
            }
        }

    }

}
