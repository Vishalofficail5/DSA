package Methods;
import java.util.Scanner;
public class Max_of_four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number1 = ");
        int N1 = sc.nextInt();
        System.out.print("Enter Number2 = ");
        int N2 = sc.nextInt();
        System.out.print("Enter Number3 = ");
        int N3 = sc.nextInt();
        System.out.print("Enter Number4 = ");
        int N4 = sc.nextInt();
        System.out.print("Max is = "+Math.max(Math.max(Math.max(N1,N2),N3),N4));
    }
}
