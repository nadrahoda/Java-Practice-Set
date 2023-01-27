package Lec2;

import java.util.*;
public class Avg {
    public static void main(String[] args) {
        
            Scanner s = new Scanner(System.in);
            
            System.out.println("Enter a name: ");
            String name = s.next();
            char N = name.charAt(0);
            System.out.println("Enter first marks: ");
            int m1 = s.nextInt();
            System.out.println("Enter second marks: ");
            int m2 =  s.nextInt();
            System.out.println("Enter third marks: ");
            int m3 = s.nextInt();

            System.out.println("Student name: " + N);
            int avg = (m1+m2+m3)/3;
            System.out.println("Average marks: " + avg);

        
    }
}
