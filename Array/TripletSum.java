package Array;

public class TripletSum {

    public static int sum(int arr[], int x){
        int count=0;
        for (int i=0 ;i<arr.length;i++){
            
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == x){
                        count++;
                        System.out.print(arr[i] + " " + arr[j] + " " +  arr[k]);
                        System.out.println();
                    }
                }
            }
    }
    return count;
}
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7 };
        int x = 12;
        System.out.println(sum(arr, x));
    }
}
