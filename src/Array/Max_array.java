package Array;
public class Max_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,6,3,7,4,57,4,34,86};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i=0; i< arr.length; i++){
            if (arr[i]>max)
                max = arr[i];
        }
        for (int j=0; j<arr.length; j++){
            if (arr[j]>smax && arr[j]!=max)
                smax = arr[j];
        }
        System.out.println(smax);
        System.out.print("This is max "+max);
    }
}
