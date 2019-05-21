/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int binSearch(int[] arr,int low,int high,int x){
        if(high < low)
            return -1;
        int mid = low + (high-low)/2;
        if(arr[mid]==x)
            return mid;
        else if(arr[mid]<x)
            return binSearch(arr,mid+1,high,x);
        else
            return binSearch(arr,low,mid-1,x);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = in.nextInt();
		}
		int x = in.nextInt();
		System.out.println(binSearch(arr,0,n-1,x));
		
	}
}

