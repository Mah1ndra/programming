/* Find if there is a subarray with zero sum

input: 
5
5 3 -2 -1 8
output:
True
*/
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
    static boolean zeroSum(int[] arr,int n){
        HashSet<Integer> hset = new HashSet<Integer>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(hset.contains(sum))
                    return true;
            else
                    hset.add(sum);
        }
        return false;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = in.nextInt();
		}
		if(zeroSum(arr,n))
		    System.out.println("True");
		else
		    System.out.println("False");
	}
}

