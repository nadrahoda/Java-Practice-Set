package Patterns_1;
/*
 A
 BC
 CDE
 DEFG
 */
import java.util.Scanner;
public class CharPattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    
    int n = s.nextInt();
        int i =1;
        while(i<=n){
            int j =1;
            char start = ((char)('A'+i-1));
            while(j<=i){
                System.out.print(start);
                start++;
                j++;
            }
            System.out.println();
            i++;;

        }
    }
}
