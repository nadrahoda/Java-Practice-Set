package Lec4;
/*
 ABCD
 BCDE
 CDEF
 DEFG
 */
import java.util.Scanner;
public class CharPattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i=1;
        
        while(i<=n){
            int j=1;
            char start = ((char)('A' + i -1));
            while(j<=n){
                System.out.print(start);
                start=((char)(start+1));
                j++;
                
            }
            System.out.println();
            i++;
        }
    }
}
