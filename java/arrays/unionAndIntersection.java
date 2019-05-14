/* Union and intersection of two sorted arrays

Input:
5
1 3 4 5 7
4
2 3 5 6

output:
Union: 
1 2 3 4 5 6 7 
Intersection: 
3 5 

*/
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
    
    static void union(int[] arr1,int n1,int[] arr2,int n2){
        int i=0,j=0;
        System.out.println("Union: ");
        while(i<n1&&j<n2){
            if(arr1[i]==arr2[j]){
                System.out.print(arr2[j++]+" ");
                i++;
            }
            if(arr1[i]>arr2[j])
                System.out.print(arr2[j++]+" ");
            else
                System.out.print(arr1[i++]+" ");
        }
        while(i<n1){
            System.out.print(arr1[i++]+" ");
        }
        while(j<n2){
            System.out.print(arr2[j++]+" ");
        }
    }
    static void intersection(int[] arr1,int n1,int[] arr2,int n2){
        int i=0,j=0;
        System.out.println("Intersection: ");
        while(i<n1&&j<n2){
            if(arr1[i]==arr2[j]){
                System.out.print(arr2[j++]+" ");
                i++;
            }
            if(arr1[i]<arr2[j])
                i++;
            else
                j++;
        }
       
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int[] arr1 = new int[n1];
		for(int i=0;i<n1;i++){
		    arr1[i] = in.nextInt();
		}
		int n2 = in.nextInt();
		int[] arr2 = new int[n2];
		for(int i=0;i<n2;i++){
		    arr2[i] = in.nextInt();
		}
	    union(arr1,n1,arr2,n2);
	    intersection(arr1,n1,arr2,n2);
	}
}

