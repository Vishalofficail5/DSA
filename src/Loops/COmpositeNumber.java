package Loops;

import java.util.Scanner;

public class COmpositeNumber {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n =sc.nextInt();
        boolean flag = true;  // True means prime.
        for(int i = 2; i<=Math.sqrt(n); i++){   // This is a better code.
            if(n%i==0){
                    flag = false; // False means composite.
                break;
            }
        }
        if(n==1) System.out.println("Neither Prime or Composite Number");
        else if(flag==false) System.out.println("Composite Number");
        else System.out.println("Prime Number");
    }
}
