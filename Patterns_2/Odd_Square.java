package Patterns_2;
/*
 1357
 3571
 5713
 7135

 */
import java.util.Scanner;
public class Odd_Square {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i=1;
        while(i<=n){
            int j=1;
            int odd=2*i-1;
            while(j<=n-i+1){
                System.out.print(odd);
                odd+=2;
                j++;
            }
            j=1;
            odd=1;
            while(j<=i-1){
                System.out.print(odd);
                odd+=2;
                j++;

            }
            System.out.println();
            i++;

        }
    }
}
