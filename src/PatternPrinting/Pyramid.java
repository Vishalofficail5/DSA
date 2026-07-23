package PatternPrinting;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_input  = sc.nextInt();
        for (int i=1; i<=user_input; i++){
            for (int j=1; j<=user_input+1-i; j++){
                System.out.print("  ");
            }
            for (int k=1; k<=i; k++){
                if ((i+user_input)%2!=0 && (i+user_input)%2==0);
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
