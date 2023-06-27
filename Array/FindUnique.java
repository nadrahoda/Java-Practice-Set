package Array;

public class FindUnique {

    public static int unique(int array[]){
        for(int i=0; i<array.length; i++){
            int count=0;
            for(int j=0; j<array.length; j++){
                
                if(array[i] == array[j]){
                  count++;
                //   System.out.println("Print i, j, array1, array2, count " + i + j+ array[i] + array[j]+ count);
                
                }
            }
            if(count ==1){
                return array[i];
            }
        }
        return -1;
        }
    
    public static void main(String[] args) {
        int array[] = {2, 4, 1, 4, 2};
        System.out.println(unique(array));
    }
}
