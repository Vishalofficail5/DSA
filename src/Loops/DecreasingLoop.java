package Loops;

import java.util.Scanner;

public class DecreasingLoop {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i = n; i>=1; i--){
            System.out.print(i+" ");
        }
    }
}
