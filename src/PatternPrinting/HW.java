package PatternPrinting;
import java.util.Scanner;
public class HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();
        for (int i=user_input; i>=1; i--){
            for (int j=1; j<=user_input-i;j++){
                System.out.print("  ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
