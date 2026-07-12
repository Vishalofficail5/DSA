package Loops;
import java.util.Scanner;
public class FactorialOfNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int o = 1;
        for (int i = 1; i <= n; i++) {
            o *= i;
        }System.out.print(o);
    }
}

