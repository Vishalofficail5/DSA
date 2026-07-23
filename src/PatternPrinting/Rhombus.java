package PatternPrinting;
import java.util.Scanner;
public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();
        for (int i=1; i<=user_input; i++){
            for (int k=1; k<user_input+1-i; k++){
                System.out.print("  ");
            }
            for (int j=1; j<=user_input; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
