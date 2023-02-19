package Operators_And_For_Loop;
/*
 Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
 */

import java.util.Scanner;
public class Sum_Product {
 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int c = s.nextInt();
    int n = s.nextInt();
    
    if(c==1){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
    else if(c==2){
        int product = 1;
        for(int i=1;i<=n;i++){
            product=product*i;
        }
        System.out.println(product);
    }
    else{
        System.out.println(-1);
    }
 }
}
