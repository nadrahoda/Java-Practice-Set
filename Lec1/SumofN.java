// Sum of numbers from 1 to N
import java.util.Scanner;
public class SumofN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum=0;
        for(int i = 1; i<=n; i++){
            sum=sum+i;
            System.out.println(sum);
        }
    }
}
