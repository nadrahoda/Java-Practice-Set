package Conditional_Loops;
// Sum of Even Numbers Till N

import java.util.Scanner;
public class SumOfEven {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();

    int i=1;
    int sum =0;
    while(i<=N){
        if(i%2==0){
            sum = sum+i;
            
        }
        i++;
        
    }
    System.out.println(sum);
    
    
}
}
