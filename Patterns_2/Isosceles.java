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
        // spaces
        int j =1;
        while(j<=n-i){
            System.out.print(" ");
            j++;

        }

        // increasing numbers
        j=1;
        int p=1;
        while(j<=i){
            System.out.print(p);
            p++;
            j++;
            }

        //decreasing numbers
            p=i-1; 
            j=1;
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
    
