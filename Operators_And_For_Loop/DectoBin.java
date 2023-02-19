package Operators_And_For_Loop;
/* Given a decimal number (integer N), convert it into binary and print. */

import java.util.Scanner;
public class DectoBin {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    long binary=0;
    long pow=1;

    while(n>0){
        int last = n%2;
        binary+=last*pow;
        pow*=10;
        n=n/2;

    }
    System.out.print(binary);
}
}
