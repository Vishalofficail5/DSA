package PatternPrinting;
import java.util.Scanner;
public class StarRectangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter numbers of column: ");
        int column = sc.nextInt();
        for(int j=1; j<=row; j++){
            System.out.println();
            for(int i=1; i<=column; i++){
                System.out.print("* ");
            }
        }
    }
}
