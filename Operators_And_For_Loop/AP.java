package Operators_And_For_Loop;
/* Write a program to print first x terms of the series 3N + 2 which are not multiples of 4. */

import java.util.Scanner;
public class AP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count=0;
        for(int i=1;count<n;i++){
            int num=3*i+2;
            if(num%4!=0){
            System.out.print(num + " ");
            count++;
        }
    }
    }
}
