package Conditional_Loops;
// Print sum of N numbers using while loop

import java.util.Scanner;
public class SumOfN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =0;
        int sum =0;
        while(i<=n){
            sum= sum+i;
            
            i=i+1;
        }
        System.out.println(sum);
        
    }
}
