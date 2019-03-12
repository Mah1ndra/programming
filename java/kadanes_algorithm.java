//Largest Sum Contiguous Subarray
import java.util.*;
import java.io.*;
import java.math.*;
public class MyClass {
   public static int maxSubArraySum(int[] arr,int n){
       int curr_max=arr[0],max = arr[0];
       for(int i=0;i<n;i++){
           curr_max = Math.max(arr[i],curr_max+arr[i]);
           max = Math.max(curr_max,max);
       }
       return max;
   }
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
       System.out.println(maxSubArraySum(arr,n));
    }
}


