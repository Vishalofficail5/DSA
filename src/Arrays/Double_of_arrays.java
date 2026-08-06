package Arrays;
import java.util.Scanner;
public class Double_of_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0; i<5; i++){
            System.out.print("Enter Arrays =  ");
            arr[i] = sc.nextInt();
        }
        for (int j=0; j<5; j++){
            System.out.print(arr[j]*2+" ");
        }
    }
}
