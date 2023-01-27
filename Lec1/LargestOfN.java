
/**
 * LargestOfN
 */
public class LargestOfN {

     public static void main(String[] args) {
          
          int arr[] = {20, 42, 56, 12, 89, 65};

          int max = arr[0];

          for(int i=0; i<arr.length; i++){
               if(arr[i]>max){
               max = arr[i];
               }
          }
          System.out.println(max);
     }
}
