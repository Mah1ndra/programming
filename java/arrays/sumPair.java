/* Given an array and a number x. find if there is pair in array with sum x.(Two pointer approach)

*we can find this i O(n) if the array is sorted.

input: 
5
20 40 50 70 80
110
output:
Pair found: 40,70

*/
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
    
    static void sumPair(int[] arr,int n,int x){
        int i=0,j=n-1,sum=0;
        while(i<j){
            sum = arr[i] + arr[j];
            if(sum==x){
                System.out.println("Pair found: "+arr[i]+","+arr[j]);
                break;
            }else if(sum>x){
                j--;
            }else{
                i++;
            }
        }
        
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
		Arrays.sort(arr);
		sumPair(arr,n,x);
	}
}

