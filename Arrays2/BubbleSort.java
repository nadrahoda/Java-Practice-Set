package Arrays2;

public class BubbleSort {

    public static int[] bubble(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){  // for more optimised result we can do arr.length-i-1
               
                if(arr[j] >arr[j+1]){
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                  
                }
            }
            
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr [] ={2, 13, 4, 1, 3, 6, 28};
        bubble(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
