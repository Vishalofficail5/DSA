package Arrays;
import java.util.Scanner;
public class Max_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int arr_size = sc.nextInt();
        int[] arr = new int[arr_size];

        for (int i=0; i<arr_size; i++){
            System.out.print("Enter array: ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int j=1; j<arr_size; j++){
            if (arr[j]>max)
                max = arr[j];
        }
        System.out.print(max);
    }
}
