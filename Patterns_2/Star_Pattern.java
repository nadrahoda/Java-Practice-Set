package Patterns_2;


/*
    *
   ***
  *****
 *******

 */
import java.util.Scanner;
public class Star_Pattern {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    int i=1;
    while(i<=n){
        int j=1;
        while(j<=n-i){
        System.out.print(" ");
        j++;
    }
    j=1;
    while(j<=(i*2-1)){
        System.out.print("*");
        j++;
    }
    // while(j<=i){
    //     System.out.print("*");
    //     j++;
    // }
    // j=1;
    // while(j<=i-1){
    //     System.out.print("*");
    //     j++;
    // }
    System.out.println();
    i++;
    }
}
}
