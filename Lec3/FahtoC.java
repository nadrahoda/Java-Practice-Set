package Lec3;
/* Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table. */

import java.util.Scanner;
public class FahtoC {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int S = s.nextInt();
    int E = s.nextInt();
    int W = s.nextInt();
    
    
    

    while(S<=E){
        int f = ((S-32)*5)/9;
        System.out.println(S + " " + f);
        S=S+W;
    }
    
}
}
