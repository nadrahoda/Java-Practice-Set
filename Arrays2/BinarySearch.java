package Arrays2;

public class BinarySearch {

    public static int search(int arr[], int x){
        
        int n = arr.length;
        int start =0; int end= n-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid] == x){
                System.out.println(mid);
                return mid;
                
            }else if(arr[mid]>x){
                end= mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 7, 9, 11, 12, 45};
        int x = 9;
        
        System.out.println("Element found at index: " +search(arr, x));


        
    }
}
