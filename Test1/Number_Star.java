package Test1;
/* Print the following pattern for given number of rows.
public class  

5432*
543*1
54*21
5*321
*4321
*/ 
import java.util.Scanner;
public class Number_Star {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

    int i=1;
    while(i<=n){
        int j=n;
        while(j>0){
            if(i==j){
            System.out.print("*");
            }
            else{
                System.out.print(j);
            }
            
            j--;
        }
        System.out.println();
    i++;
    }
    
    }
}
