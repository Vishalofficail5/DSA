package PatternPrinting;
import java.util.Scanner;
public class Number_Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();
        for (int i=1; i<=2*user_input-1; i++){
            for (int j=1; j<=2*user_input-1; j++){
                int a = i,b = j;
                if (i>user_input) a = 2*user_input-i;
                if (j>user_input) b = 2*user_input-j;
                System.out.print((Math.min(a,b))+" ");
            }
            System.out.println();
        }
    }
}
