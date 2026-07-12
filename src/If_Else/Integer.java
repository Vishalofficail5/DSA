package If_Else;

import java.util.Scanner;

public class Integer {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        double n = sc.nextDouble();
        int x = (int)n;
        if(n-x == 0) System.out.println("Integer");
        else System.out.println("Not an Integer");
    }
}
