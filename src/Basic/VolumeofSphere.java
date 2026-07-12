package Basic;
        import java.util.Scanner;
public class VolumeofSphere {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double a = 3.14159 * r *r*r;
        double v = 1.33333*a;
        System.out.println(v);
    }
}
