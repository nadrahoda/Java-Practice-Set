package Array;

public class Sort {

    public static void counting(int[] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] ==0){
                count++;
            }
        }

        for(int i=0; i<count; i++){
            arr[i] =0;
        }
        for(int i=count; i<arr.length; i++){
            arr[i] =1;
        }
        
    }


    public static void main(String[] args) {
        int array[] = { 0, 1, 0, 0, 1, 1, 0, 1};
        counting(array);
        System.out.println("Array after sorting");
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
            }
    }
}
