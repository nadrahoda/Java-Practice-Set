package Conditional_Loops;
// Check Prime Number with While Loop

import java.util.Scanner;
public class WhilePrime {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    int i = 2; // Staring from 2 and go upto n-1 bcoz Prime number is divisible by 1 and itself.
    while(i<=n-1){
    // checking if a number is divisble by 2 or not, if it is then its not a prime number
        if(n%i==0){ 
            System.out.println("It's Not a Prime Number");
            return;
        }
        i=i+1; // after 2 we divide with 3 and so on to check if its divisibler by any number
    }

    // if it doesn't gets divided by any no. then its Prime number
    System.out.println("It's a Prime Number");
}
}
