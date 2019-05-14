
/* Substring sorting

Given a string S, and two numbers N, M - arrange the characters of string in between the indexes N and M (both inclusive) in descending order. (Indexing starts from 0).

input:
3
hlleo 1 3
ooneefspd 0 8
effort 1 4

output:
hlleo
spoonfeed
erofft

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
		int t = in.nextInt();
		in.nextLine();
		while(t-->0){
		    String s = in.next();
		    int n = in.nextInt();
		    int m = in.nextInt();
		    System.out.print(s.substring(0,n));
		    String temp = s.substring(n,m+1);
		    char[] carr = temp.toCharArray();
		    Arrays.sort(carr);
		    String s1 = new String(carr);
		    StringBuilder sb = new StringBuilder(s1);
		    System.out.print(sb.reverse());
		    System.out.print(s.substring(m+1,s.length()));
		    System.out.println();
		}
	}
}

