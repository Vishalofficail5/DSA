package Basic;

    import java.util.Scanner;

public class ThreeNumbersSum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int A =sc.nextInt();
        System.out.print("Enter Second Number: ");
        int B =sc.nextInt();
        System.out.print("Enter Third Number: ");
        int C =sc.nextInt();

        int P = A+B+C;
        System.out.print("Sum is: ");
        System.out.print(P);
    }
}
