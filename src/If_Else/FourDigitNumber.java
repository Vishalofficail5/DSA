package If_Else;

import java.util.Scanner;

public class FourDigitNumber {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if (n>999 && n<10000){
            System.out.println("Four Digit Number");
        }
        else {
            System.out.println("Not Four Digit Number");
        }
    }
}
