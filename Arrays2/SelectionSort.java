package Arrays2;

public class SelectionSort {
    public static int[] selection(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int min= arr[i];
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(min>arr[j]){
                    min=arr[j];
                    minIndex =j;
                }
            }
            if(minIndex!=i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 6, 9, 1, 5};
        selection(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}