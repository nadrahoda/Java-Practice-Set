package Array;
// Find largest element in an array

import java.util.*;
public class Largest_Element {
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        return arr;
        }
        public static int largest(int arr[]){
            int size = arr.length;
            int max= Integer.MIN_VALUE;
            for(int i=0; i<size; i++){
                
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
        }
        public static void main(String[] args) {
            int[] array = takeInput();
            int largestvalue = largest(array);
            System.out.println("Largest value is " + largestvalue);


        }
    }

