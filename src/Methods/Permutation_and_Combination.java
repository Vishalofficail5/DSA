package Methods;
import java.util.Scanner;
public class Permutation_and_Combination {
    public static int fact(int x){
        int o = 1;
        for (int i=1; i<=x; i++){
            o*=i;
        }
        return o;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nCr = fact(n)/fact(r)*fact(n-r);
        int nCp = fact(n)/fact(n-r);
        System.out.print(nCp+" "+nCr);
    }
}
