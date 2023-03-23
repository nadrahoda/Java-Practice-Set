package Array;
// taking input and printing array into functions
import java.util.Scanner;
public class UsingFunction {
    
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size;i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void print(int arr[]){
        int size=arr.length;
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = takeInput();
        print(array);
    }

}
