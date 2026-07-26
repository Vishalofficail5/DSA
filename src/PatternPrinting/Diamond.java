package PatternPrinting;
import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();
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
        user_input--;
        nsp=1;
        nst = (user_input*2)-1;
        for (int i=1; i<=user_input; i++){
            for (int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for (int k=1; k<=nst; k++){
                System.out.print("* ");
            }
            System.out.println();
            nst-=2;
            nsp++;
        }
    }
}

