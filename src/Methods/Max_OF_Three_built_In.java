package Methods;
import java.util.Scanner;
public class Max_OF_Three_built_In {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_input1 = sc.nextInt();
        int user_input2 = sc.nextInt();
        int user_input3 = sc.nextInt();
        System.out.print("Maximum is = "+Math.max(Math.max(user_input1,user_input2),user_input3));
    }
}
