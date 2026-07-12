package Loops;

import java.util.Scanner;

public class SunOfReveseNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int p = n;
        int r = 0;
        while (n!=0){
            r=r*10;
            r=r+(n%10);
            n=n/10;
        }int o = r;
        System.out.println(p+r);
    }
}