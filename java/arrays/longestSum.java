/* Longest Span with same Sum in two Binary arrays

Input: arr1[] = {0, 1, 0, 0, 0, 0};
       arr2[] = {1, 0, 1, 0, 0, 1};
Output: 4

input: 
7
0 1 0 1 1 1 1
1 1 1 1 1 0 1
output:
6

*/
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
    
    static int maxSpan(int[] arr1,int[] arr2,int n){
        int[] diffarr = new int[2*n+1];
        int s1=0,s2=0,len=0;
        for(int i=0;i<n;i++){
            s1 += arr1[i];
            s2 += arr2[i];
            int diff = s1-s2;
            int diffIndex = n + diff;
            if(diff==0)
                len = i+1;
            else if(diffarr[diffIndex]==-1)
                    diffarr[diffIndex] = i;
            else{
                int l = i - diffarr[diffIndex];
                if(l>len)
                    len = l;
            }
            
        }
        return len;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr1 = new int[n];
		for(int i=0;i<n;i++){
		    arr1[i] = in.nextInt();
		}
		int[] arr2 = new int[n];
		for(int i=0;i<n;i++){
		    arr2[i] = in.nextInt();
		}
	    System.out.println(maxSpan(arr1,arr2,n));
	}
}

