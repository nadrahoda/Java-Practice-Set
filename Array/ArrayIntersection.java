package Array;


import java.util.Scanner;
public class ArrayIntersection {
    
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int size1 = s.nextInt();

        int array1[] = new int[size1];
        for(int i=0; i<array1.length; i++){
            array1[i] = s.nextInt();
        }

        
        
        return array1;
        
    }
    public static int[] takeInputs(){
        Scanner s = new Scanner(System.in);
        int size2 = s.nextInt();
        int array2[] = new int[size2];

        
        for(int j=0; j<array2.length; j++){
            array2[j] = s.nextInt();
        }
        return array2;
    }

    public static void Intersection(int array1[], int array2[]){
        
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array2.length; j++){
                if (array1[i]==array2[j]){
                    System.out.print(array1[i] + " ");
                    array2[j] = Integer.MIN_VALUE;
                    break;
            }
        }
    }
    

}

public static void main(String[] args) {
    int arr1[] = takeInput();
    int arr2[] = takeInputs();

    System.out.println("Intersection of two arrays are : ");

    Intersection(arr1, arr2);
    
}
}
