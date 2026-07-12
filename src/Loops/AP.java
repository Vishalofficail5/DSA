package Loops;

import java.util.Scanner;

public class AP {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // AP - 2,5,8,11,.......
//        for(int i=2; i<=3*n-1; i= i+3){
//            System.out.print(i+" ");
//        }

        int a = 2;               /// <-----THIS THING ONLY WORK IF I WANT TO PRINT nth TERMS.
        int d = 3;
        for(int i=1; i<=n; i++){
            System.out.print(a+" ");
            a = a+d;
        }
    }
}
