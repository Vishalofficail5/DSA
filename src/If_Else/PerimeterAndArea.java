package If_Else;

import java.util.Scanner;

public class PerimeterAndArea {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Rectangle: ");
        int L = sc.nextInt();

        Scanner cc = new Scanner(System.in);
        System.out.print("Enter Breath of Rectangle: ");
        int B  = sc.nextInt();

        int P = 2*(L+B);
        int A = L+B;

        if(P>A){
            System.out.println(P);
            System.out.print("Parameter Is Greater");
        }else{
            System.out.println(A);
            System.out.print("Area Is Greater");
        }
    }
}
