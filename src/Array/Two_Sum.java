package Array;
import java.util.Scanner;
public class Two_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Target: ");
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int Target = sc.nextInt();
        for (int i=0; i<Target; i++){
            for (int j=1; j<Target; j++){
                if (arr[i]+arr[j] == Target){
                    System.out.print("True");
                }
                break;
            }
        }
        System.out.print("false");
    }
}
