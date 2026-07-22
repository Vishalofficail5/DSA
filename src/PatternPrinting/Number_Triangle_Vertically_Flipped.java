package PatternPrinting;
import java.util.Scanner;
public class Number_Triangle_Vertically_Flipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();
        for (int i=1; i<=user_input; i++){
            for (int j=1; j<=user_input-i; j++){
                System.out.print("  ");
            }
            for (int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
