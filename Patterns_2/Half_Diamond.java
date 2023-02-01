package Patterns_2;
/*
 *
 *1*
 *121*
 *12321*
 *1234321*
 *123454321*
 *1234321*
 *12321*
 *121*
 *1*
 *
 */
import java.util.Scanner;
public class Half_Diamond {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    System.out.print("*");
    System.out.println();

    int i=1;
    while(i<=n){
        System.out.print("*");
        int j=1;
        while(j<=i){
            System.out.print(j);
            j++;
        }
        j=i-1;
        while(j>=1){
            System.out.print(j);
            j--;
        }
        System.out.print("*");
        System.out.println();
        i++;

    }
    

    i=n-1;
    while(i>0){
        System.out.print("*");
        int j=1;
        while(j<=i){
            System.out.print(j);
            j++;
        }
        j=i-1;
        while(j>=1){
            System.out.print(j);
            j--;
        }
        System.out.print("*");
        System.out.println();
        i--;
    }
    System.out.print("*");
    

    }

}
