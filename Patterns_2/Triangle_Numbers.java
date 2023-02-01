package Patterns_2;

/*
   1
  232
 34543
4567654
 */
import java.util.Scanner;

public class Triangle_Numbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;

            }
            j = 1;
            int count = i;
            while (j <= i) {
                System.out.print(count);
                count++;
                j++;

            }
            j = 1;
            count = 2 * i - 2;
            while (j <= i - 1) {
                System.out.print(count);
                count--;
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
