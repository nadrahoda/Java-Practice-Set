/*
   1
  121
 12321
1234321
 */
package Patterns_2;

/**
 * Isosceles
 */
import java.util.Scanner;
public class Isosceles {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    
    int i=1;
    while(i<=n){
        int j =1;
        while(j<=n-i){
            System.out.print(" ");
            j++;

        }
        j=1;
        int p=1;// increasing numbers
        while(j<=i){
            System.out.print(p);
            p++;
            j++;
            }
            p=1; //decreasing numbers
            while(j<=i-1){
                System.out.print(p);
                p--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
    
