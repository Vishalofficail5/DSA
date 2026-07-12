package Basic;

    import java.util.Scanner;

public class SimpleInterest {
    static void main() {
        Scanner sc = new Scanner(System.in); // This line is for taking input from user>>

        System.out.print("Enter Principle Amount: ");
        double P =sc.nextDouble();
        System.out.print("Enter Rate: ");
        double R =sc.nextDouble();
        System.out.print("Enter Time(IN YEARS): ");
        double T =sc.nextDouble();

        double SI = P*R*T/100;
        System.out.print("Interest is: ");
        System.out.print(SI);
    }
}
