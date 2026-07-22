package PatternPrinting;
import java.util.Scanner;
public class Alphabet_Triangle_Vertically_flipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();
        for (int i=1; i<=user_input; i++){
            for (int j=1; j<=user_input-i; j++){
                System.out.print("  ");
            }
            for (int k=1; k<=i; k++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
