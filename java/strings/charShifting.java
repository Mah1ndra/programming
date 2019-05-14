/* 
Approach:
1. Declare an auxilary string carr that is same size of "S"
2.copy ith element of "s" to (k+i)th position in "carr". This means carr[k+i] = s[i] where 0<i<N
3.Make sure that i+k never exceeds N, because that will try to access a memory location which is not declared in "carr". The simple trick is (k+i)%N; 

*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int k = in.nextInt();
		int len = s.length();
		char[] carr = new char[len];
		for(int i=0;i<len;i++){
		    int idx = (i+k)%len;
		    carr[idx] = s.charAt(i);
		}
		System.out.println(carr);
		
	}
}

