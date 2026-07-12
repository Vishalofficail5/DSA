package Loops;

import java.util.Scanner;

public class AllFactors {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i = 1; i<=Math . sqrt(n); i++){
            if(n%i==0){
                System.out.println(i+" "+n/i);
                if (i==n/i){               /// *****THIS CONDITION ONLY RUN WHEN i=n/i MEANS i IS SQUARE OF n/i******
                    System.out.println(i);
                }
            }
        }
    }
}
