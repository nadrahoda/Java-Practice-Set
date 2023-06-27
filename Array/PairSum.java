package Array;

public class PairSum {

    public static int sum(int arr[], int x){
        int count=0;
        for(int i=0; i<arr.length; i++){
            
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == x){
                    count++;
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
            
        }
        return count;
        
        
    }
    

    public static void main(String[] args) {
        int arr[] = { 0, 1,2 ,3, 4, 5, 6 ,7 , 8 ,9};
        int x=9;
        System.out.println("Number of pairs are: "+sum(arr,x));
    }
}
