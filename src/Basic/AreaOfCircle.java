package Basic;

import java.util.Scanner;

public class AreaOfCircle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = 3.14*r*r;
        System.out.println(area);
    }
}
