package Operators_And_For_Loop;
/*
 You are given S, a sequence of n integers i.e. S = s1, s2, ..., sn. Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) in such a way that the first part is strictly decreasing while the second is strictly increasing one
 */
import java.util.Scanner;
public class Number_Sequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int prev = s.nextInt();
        int count =2, current;
        boolean isDec = true;

        while(count<=n){
            current = s.nextInt();
            count++;
            if(current == prev){
                System.out.println("false");
                return;
            }
            if(current<prev){
                if(isDec ==false){
                    System.out.println("false");
                    return;
                }
            }
            else{
                if(isDec ==true){
                    isDec = false;
                }
            }
            prev = current;
        }
        System.out.println("true");
    }
}
