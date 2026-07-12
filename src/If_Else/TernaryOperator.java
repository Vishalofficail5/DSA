package If_Else;

import java.util.Scanner;

public class TernaryOperator {

    static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number: ");
//        int a = sc.nextInt();
//
//        // condition ? true : false:  = Ternary Operator.  ***First Use case***
//
//        System.out.println((a%2 == 0)? "Even" : "Odd");


//           *****Nested Ternary Operator*****


        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();


        System.out.println((a>=b)?(a>=c? "a" : "c"):(b>=c? "b":"c"));
    }
}
