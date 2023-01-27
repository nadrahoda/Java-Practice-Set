import java.util.Scanner;
public class CheckTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();

        if(A==B && B==C && C==A){
            System.out.println("Equilateral");
        }
        else if(A==B || B==C || C==A){
            System.out.println("Isocelces Triangle");
        }else{
            System.out.println("Scalene Triangle");
        }
    }
}
