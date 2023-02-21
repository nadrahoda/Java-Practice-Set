package Functions;
/*
 Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
 */
import java.util.Scanner;
public class Fibonacci {

    public static boolean checkFibonacci(int n){
        int a =0;
        int b=1;
        int c;
        while(a<n){
            c=a+b;
            a=b;
            b=c;
        }
        if(a==n){
            return true;

        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(checkFibonacci(n));


    }
}
