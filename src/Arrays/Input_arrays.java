package Arrays;
import java.util.Scanner;
public class Input_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[13];
        System.out.print(arr.length);
        for (int i=0; i<13; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<13; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
