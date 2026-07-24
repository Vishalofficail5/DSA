package PatternPrinting;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_input  = sc.nextInt();
//        for (int i=1; i<=user_input; i++){
//            for (int j=1; j<=user_input-i; j++){
//                System.out.print("  ");
//            }
//            for (int k=1; k<=2*i-1; k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//***************METHOD-2******************

        int nsp = user_input-1, nst = 1;
        for (int i=1; i<=user_input; i++){
            for (int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for (int k=1; k<=nst; k++){
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }
    }
}
