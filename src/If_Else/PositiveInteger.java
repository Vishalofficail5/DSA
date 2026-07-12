package If_Else;

import java.util.Scanner;

public class PositiveInteger {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        if(n%5==0 && n%3==0)
            System.out.println("Hello");
         else if (n%5==0)
            System.out.println("Mello");
         else if (n%3==0)
            System.out.println("Kello");
        else System.out.println("cello");
        
    }
}
