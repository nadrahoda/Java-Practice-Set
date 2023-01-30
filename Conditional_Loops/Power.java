package Conditional_Loops;
// Write a program to find x to the power n (i.e. x^n).

import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        

        int result=1;

        for(int i=1; i<=x; i++){
            result=n*result;
        }
        System.out.println(result);


    }
    
}
