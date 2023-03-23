package Array;

import java.util.Scanner;

public class Linear_Search {
    
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int search(int arr[], int x){
        for(int i=0; i<arr.length; i++){

            if(arr[i] == x){
                return i;
            }
            }
            return -1;
        }
        
    
    public static void main(String[] args) {
        int array[] = takeInput();
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int linear_search = search(array, x);
        System.out.println(linear_search);
        
    }
}
