package Operators_And_For_Loop;
/*
 Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
 1234 into 4321
 */

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int rev=0;
        int temp = n;

        while(temp>0){
            int last = temp%10;
            temp=temp/10;
            rev=rev*10+last;
        }
        System.out.println(rev);
    }
}
