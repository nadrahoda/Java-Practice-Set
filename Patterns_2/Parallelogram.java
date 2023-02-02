package Patterns_2;
/*
 ***
  ***
   ***
 */

import java.util.Scanner;
/**
 * Parallelogram
 */
public class Parallelogram {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();

        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i-1){  // j<i also satisfies the condition here
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=n){
            System.out.print("*");
            j++;
        }
        System.out.println();
        i++;
    }
}
}