package Array;
import java.util.Scanner;
public class Search_in_array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int user_input = sc.nextInt();
        int[] arr ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        boolean flag = false;
        for (int i=0;i<arr.length; i++){
            if (arr[i] == user_input){
                flag = true;
                break;
            }
        }
        if (flag == true){
            System.out.print("Yes "+user_input+" is in array");
        }else System.out.print(user_input+" not in array");
    }
}
