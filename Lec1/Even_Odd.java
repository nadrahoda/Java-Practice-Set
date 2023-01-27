import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();

    if(N%2==0){
        System.out.println("The number is Even");
    }else{
        System.out.println("The number is odd");
    }
}
}
