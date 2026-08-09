package Array;
import java.util.Scanner;
public class Multiply_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arr_size = sc.nextInt();

        int[] arr = new int[arr_size];
        for (int i=0; i<arr_size; i++){
            System.out.print("Enter arrays: ");
            arr[i] = sc.nextInt();
        }
        for (int j=0; j<arr_size; j++){
            if (j%2==0)
                arr[j]=arr[j]+10;
            else arr[j] = arr[j]*2;
            System.out.print(arr[j]+" ");
        }
    }
}
