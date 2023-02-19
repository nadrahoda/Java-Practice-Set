package Operators_And_For_Loop;
/*
 Given a number N, find its square root. You need to find and print only the integral part of square root of N.
 */

import java.util.Scanner;
public class Square_Integral {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    int i=0;
    while(i*i<=n){
        i++;
        // System.out.print(i);
    }
    i=i-1;
    System.out.println(i);


}
}
