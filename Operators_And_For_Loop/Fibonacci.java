package Operators_And_For_Loop;

// Fibonacci Number

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    int a =0;
    int b=1;

    for(int i=0; i<n ; i++ ){
        int c = a+b;
        a=b;
        b=c;
        
    }
    System.out.print(a + " ");
    
}
}
