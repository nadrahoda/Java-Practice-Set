import java.util.Scanner;
public class ValidTriangle {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int A = s.nextInt();
            int B = s.nextInt();
            int C = s.nextInt();

            if(A+B>C & B+C>A & C+A>B){
                System.out.println("Yes It's Valid Triangle");
            }
            else{
                System.out.println("No, It's not a Valid Triangle");
            }
    }
}
