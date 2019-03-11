import java.util.*;
import java.lang.*;
import java.io.*;
//No. of subsets for an arr size on 'n' is 2^n
class Codechef
{
    public static void subset(int[] arr,int len){
        for(int i=0;i<(1<<len);i++){
            for(int j=0;j<len;j++){
                if((i&(1<<j))>0)
                    System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
		    int n = in.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = in.nextInt();
		    }
		    subset(arr,n);
		}
	}
}

