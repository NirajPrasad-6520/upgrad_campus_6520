package Array;

public class FindDuplicateArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,6,2,3,6,9,8,7};
        System.out.println("Duplicate elementa in given array:");
        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++)
        for(int j = i + 1; j < arr.length; j++)
        if(arr[i] == arr[j])
        System.out.print(arr[j] + " ");
    }
    
}
