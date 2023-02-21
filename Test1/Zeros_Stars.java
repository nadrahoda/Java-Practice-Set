package Test1;
/*
*000*000*
0*00*00*0
00*0*0*00
000***000
 */

import java.util.Scanner;
public class Zeros_Stars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                if(i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print("0");
                }
                j++;
                
            }
            System.out.print("*");
            j=j-1;
            while(j>0){
                if(i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print("0");
                }
                j--;
                
            }
            i++;
            System.out.println();
        }
    }
}
