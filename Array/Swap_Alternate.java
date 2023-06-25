package Array;


import java.util.Scanner;
public class Swap_Alternate {

    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] SwapAlternate(int arr[]){
        for(int i=0; i<arr.length-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int array[] = takeInput();
        printArray(array);
        int swap[] = SwapAlternate(array);
        // SwapAlternate(swap);
        printArray(swap);
    }
}
