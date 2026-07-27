package PatternPrinting;
import java.util.Scanner;
public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();
        for (int i=1; i<=2*user_input-1; i++){
            System.out.print("* ");
        }
        System.out.println();
        int nst = user_input-1 ;
        int nsp = 1;
        for (int i=1; i<=user_input; i++){
            for (int j=1; j<=nst; j++){
                System.out.print("* ");
            }
            for (int k=1; k<=nsp; k++){
                System.out.print("  ");
            }
            for (int j=1; j<=nst; j++){
                System.out.print("* ");
            }
            System.out.println();
            nst--;
            nsp+=2;
        }
    }
}