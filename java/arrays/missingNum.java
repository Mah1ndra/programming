/* Find the missing number(using XOR)

Input:
7
1 2 3 4 6 7 8

output:
5

*/
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
    static int getMissing(int[] arr,int n){
        int sum = arr[0];
        int nat = 1;
        for(int i=1;i<n;i++){
            sum ^= arr[i];
        }
        for(int j=2;j<=n+1;j++){
            nat ^= j;
        }
        return sum ^ nat;
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = in.nextInt();
		}
		System.out.println(getMissing(arr,n));
		
	}
}

