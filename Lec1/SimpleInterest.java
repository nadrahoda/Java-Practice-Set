import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float P = s.nextInt();
        float R = s.nextInt();
        float T = s.nextInt();

       
        float SI = (P*R*T)/100;

        System.out.println(SI);


    }
}
