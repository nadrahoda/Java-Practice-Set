package Lec3;
// Multiplication Table

import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i=1;
    int mul;
    while(i<=10){
        mul = n*i;
        System.out.println(n + "x" + i + "=" + mul );
        i=i+1;
    }
}
}
