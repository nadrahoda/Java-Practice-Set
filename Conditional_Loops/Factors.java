package Conditional_Loops;
/* Write a program to print all the factors of a number other than 1 and the number itself. */

import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = s.nextInt();
    int i=2;
    
    while(i<n){
        if(n%i==0){
            System.out.print(i + " ");
        }
        i=i+1;
        

    }
    

    }
}
