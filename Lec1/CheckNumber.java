import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n>0){
            System.out.println("1");
        }else if(n<0){
            System.out.println("-1");
        }else{
            System.out.println("0");
        }
    }
}
