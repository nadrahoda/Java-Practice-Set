package Operators_And_For_Loop;
/*  Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive). */

import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       
       for(int i=2;i<=n;i++){
        boolean isPrime = true;
        for(int j=2; j<i;j++){
            if(i%j==0){
                isPrime = false;
                break;

            }
        }
            if(isPrime){
                System.out.print(i+ " ");
            }
        }
       
       
    }
}
