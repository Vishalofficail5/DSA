package If_Else;

import java.util.Scanner;

public class LocationOFPoint {
     static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = sc.nextInt();

        System.out.print("Enter Y : ");
        int y = sc.nextInt();

        if(x>0 && y>0 ){
            System.out.println("Point is in 1st Quadrant ");
        } else if (x<0 && y>0) {
            System.out.println("Point is in 2nd Quadrant ");
        } else if (x<0 && y<0) {
            System.out.println("Point is in 3rd Quadrant ");
        } else if (x>0 && y<0) {
            System.out.println("Point is in 4th Quadrant ");
        } else if (x==0 && y !=0) {
            System.out.println("Point is in Y-axis ");
        } else if (x !=0 && y==0) {
            System.out.println("Point is in X-axis ");
        }else{
            System.out.println("Point is in Origin");
        }
    }
}
