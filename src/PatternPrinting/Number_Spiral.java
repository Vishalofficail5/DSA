package PatternPrinting;
import java.util.Scanner;
public class Number_Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();
        for (int i=1; i<=user_input; i++){
            for (int j=1; j<=user_input; j++){
                if (i<=j){
                    System.out.print(i+" ");
                }else if (j<=i) {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
    