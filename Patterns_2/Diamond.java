package Patterns_2;
/*
     *
    ***
   *****
    ***
     *
 */
import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    // divide pattern into two halves
    int n1 = (n+1)/2; 
    int n2 = n/2;

    int i =1;
    while(i<=n1){
        int j=1;
        while(j<=n1-i){
            System.out.print(" ");
            j++;
        }
        j=1;
        while(j<=2*i-1){
            System.out.print("*");
            j++;
        }
        System.out.println();
        i++;
    }

    i=1;
    int i2=n2;
    while(i<=n2){
        int j=1;
        while(j<=n2-i2+1){
            System.out.print(" ");
            j++;
        }
        j=1;
        while(j<=2*i2-1){
            System.out.print("*");
            j++;
        }
        System.out.println();
        i++;
        i2--;

    }


    }
}
