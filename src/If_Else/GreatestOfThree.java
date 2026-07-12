package If_Else;

import java.util.Scanner;

public class GreatestOfThree {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int A = sc.nextInt();

        System.out.print("Enter B: ");
        int B = sc.nextInt();

        System.out.print("Enter C: ");
        int C = sc.nextInt();

//        if(A>B && A>C){
//            System.out.println(A);
//        } else if (B>A && B>C) {
//            System.out.println(B);
//        }else {
//            System.out.println(C);
//        }



        // *******Nested If-else********
        if (A>=B){
            if(A>C)
                System.out.println(A);
            else
                System.out.println(C);
        }

        else{
            if(B>=C)
                System.out.println(B);
            else
                System.out.println(C);
        }
    }
}


