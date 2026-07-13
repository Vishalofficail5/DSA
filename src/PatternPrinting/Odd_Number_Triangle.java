package PatternPrinting;
import java.util.Scanner;
public class Odd_Number_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();
        for (int i=1; i<=user_input; i++){
            int new_var=1;
            for (int j=1; j<=i; j++){
                System.out.print(new_var+" ");
                new_var+=2;
            }
            System.out.println();
        }
    }
}
