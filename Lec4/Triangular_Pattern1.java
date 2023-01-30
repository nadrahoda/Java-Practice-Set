package Lec4;
/*
 1
 23
 234
 3456
 */
import java.util.Scanner;
public class Triangular_Pattern1 {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    
    int i=1;
    while(i<=n){
        int j=1;
        int start=i;
        while(j<=i){
            
            System.out.print(start); //col+row-1
            start++;
            j++;
           
        }
        System.out.println();
        i++;
    }

}
}
