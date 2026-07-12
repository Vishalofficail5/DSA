package Loops;

import java.util.Scanner;

public class SpecialSequence {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a;
        for(int i = 1; i<=n; i++){
            a = n-i;
            System.out.print(i+" "+a+" ");

        }
    }
}
