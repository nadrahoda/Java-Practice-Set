package Operators_And_For_Loop;
/*
 Given a binary number as an integer N, convert it into decimal and print.
 */

import java.util.Scanner;
public class BintoDec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int decimal=0; int pow=1;
        while(n>0){
            int last=n%10;
            decimal=decimal+(last*pow);
            pow*=2;
            n=n/10;
        }
        System.out.print(decimal);
    }
}
