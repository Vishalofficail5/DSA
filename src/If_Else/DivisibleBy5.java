package If_Else;

import java.util.Scanner;

public class DivisibleBy5 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        double n = sc.nextDouble();

        if(n%5==0){
            System.out.print("Divisible By 5");
        } else {
            System.out.println("Not Divisible By 5");
        }
    }
}
