package Array;
public class LargestAndSmallestElementArray 
{
    public static void main(String[] args) 
    {
        int arr[] = new int[]{1,2,3,4,5,12,14,15};
         //Initialize max with first element of array.  
         int max = arr[0];
         int min = arr[0];   

         for (int i = 0; i < arr.length; i++) 
         {  
           //Compare elements of array with max  
              if(arr[i] > max)  
                max = arr[i];  
                else if(arr[i] < min)//Smallest element  
                min = arr[i];
         }  
         System.out.println("Largest element present in given array: " + max);
         System.out.println("Smallest element present in given array: " + min); 
    }  
}
