package Basic;

import java.util.Scanner;

public class TotalSurfaceAreaOfCuboid {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length:");
        double L =sc.nextDouble();
        System.out.print("Enter Breath:");
        double B =sc.nextDouble();
        System.out.print("Enter Height:");
        double H =sc.nextDouble();

        double P =2*(L*B+B*H+H*L);
        System.out.print("Area Of Cuboid is:");
        System.out.println(P);
    }
}
