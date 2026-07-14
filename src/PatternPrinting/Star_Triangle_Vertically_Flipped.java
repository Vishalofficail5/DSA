package PatternPrinting;
import java.util.Scanner;
public class Star_Triangle_Vertically_Flipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();
//        for (int i=1; i<=user_input; i++){
//            for (int j=1; j<=user_input; j++){
//                if ((i+j)>user_input) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }
        // ***New method***
        for(int i=1; i<=user_input; i++){
            for (int j=1; j<=user_input-i; j++){
                System.out.print("  ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
