package Loops;

public class EvenNumbersWithContinuesStatement {
    static void main(String[] args) {
        for(int i=1; i<=100; i++){
            if(i%2==1) continue;{  //Continue skip
                System.out.print(i+" ");
            }
        }
    }
}
