package Loops;
import java.util.Scanner;
public class PowerofNumber {
    static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = cs.nextInt();

        System.out.print("Enter b: ");
        int b = cs.nextInt();
        int o = 1;
        for(int i=1; i<=b; i++){
            o*=a;
        }System.out.println(o);
    }
}
