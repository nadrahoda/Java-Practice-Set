package Array;

import java.util.Scanner;
public class Array_Sum {

    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int addsum(int arr[]){
        int sum =0;
        for(int i=0; i<arr.length; i++){
            
            sum+= arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        
        int array[] = takeInput();
        int sumvalue = addsum(array);
        System.out.println(sumvalue);
    }
}
