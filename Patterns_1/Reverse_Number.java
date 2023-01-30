package Patterns_1;

/*
 1
 21
 321
 4321
 */
import java.util.Scanner;
public class Reverse_Number {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    
    int i =1;
    while(i<=n){
        int j = i; // if i is iterating once column will be 1 if 2 then column is 2
        while(j>=1){ // here we are taking value upto 1, 1 is min value.
            System.out.print(j);
            j--;
        }
        System.out.println();
        i++;

    }

}
}
