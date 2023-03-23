package Array;
// Take input and print an array
import java.util.Scanner;
public class Taking_Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        
        for(int i=0; i<size;i++){
            arr[i] = s.nextInt();
        }

        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
