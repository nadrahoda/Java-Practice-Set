package Patterns_1;
/*
 1
 23
 456
 78910
 */
import java.util.Scanner; 
public class Triangular_Pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i=1;
        int count=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(count);
                count++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
