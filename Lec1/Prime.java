//Not completed yet............!
import java.util.Scanner;

/**
 * Prime
 */
public class Prime {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean flag = false;
        for(int i=2; i<n;i++){
            if(n%i==0){
                System.out.println("Not a prime");
                flag = true;
                break;
            }
          
        }
        if(!flag)
        System.out.println("Prime Number");
    }
}



