package Test1;

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int digit=0;
        int temp = n;

        // we will count the number of digits here
        while(temp>0){
            temp = temp/10;
            digit++;
        }
        int sum=0;
        temp=n;
        while(temp>0){
            int last = temp%10;
            sum += Math.pow(last,digit);
            temp = temp/10;
        }

        if(sum==n){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
