package Arrays;
import java.util.Scanner;
public class Negative_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int array_size = sc.nextInt();
        int[] arr = new int[array_size];
        for (int i=0; i<array_size; i++){
            System.out.print("Enter array: ");
            arr[i] = sc.nextInt();
        }
        for (int j=0; j<array_size; j++){
            if (arr[j] < 0){
                System.out.print(arr[j]+" ");
            }
        }
    }
}
