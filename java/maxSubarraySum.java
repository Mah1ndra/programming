import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    public static int maxSubArraySum(int[] arr,int n){
        int max = Integer.MIN_VALUE,curr_max = 0;
        for(int i=0;i<n;i++){
            curr_max = Math.max(arr[i],curr_max+arr[i]);
            max = Math.max(max,curr_max);
        }
        return max;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		//in.nextLine();
	    while(t-->0){
	      int n = in.nextInt();
	      int[] arr = new int[n];
	      for(int i=0;i<n;i++){
	          arr[i] = in.nextInt();
	      }
	     System.out.println(maxSubArraySum(arr,n));
	    }      
	}
}

