package If_Else;

import java.util.Scanner;

public class ProfitLoss {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        double CP = sc.nextDouble();
        System.out.print("Enter Selling Price: ");
        double SP = sc.nextDouble();
        double x = SP - CP;
        sc.close();
//                    Method - 1
//        if (CP < SP) System.out.println("Profit");
//        if (CP > SP) System.out.println("Loss");
//        if (CP == SP) System.out.println("No Profit No loss");

//                    Method - 2

          if (CP < SP) System.out.println("Profit");
          else if (CP > SP) System.out.println("Loss");       // else_if leader
          else System.out.println("No Profit No loss");

        System.out.print(x);
    }
}
