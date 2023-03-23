package Array;




import java.util.Scanner;
public class Arrange_Numbers {

    
    public static int[] arrange() {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N];

        int start = 0;
        int end = N-1;
        int value=1;
       while(start<end){
        arr[start] = value; 
        value++;
        start++;

        arr[end] = value;
        value++;
        end--;
       }
            
       if(start==end){
        arr[start] = value;
       }
        
       return arr;


    }
    public static void main(String[] args) {
        int array[] = arrange();
        System.out.print(array);
        
    }

    
}
