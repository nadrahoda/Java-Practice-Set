package Conditional_Loops;
// Sum of Even Odd

import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    int even=0;
    int odd=0;

    while(n>0){
        int digit = n%10;
        n = n/10;
        if(digit%2==0){
            even = digit +even;
        }
        else{
            odd = odd+digit;
        }
        System.out.println(even + " " + odd);
    }
}
}
