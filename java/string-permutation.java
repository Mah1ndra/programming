import java.util.*;
import java.lang.*;
import java.io.*;
//permutation of a given String: complexity O(n*n!)
//There are n! permutation and it requires O(n) time to print a a permutation.
class Codechef
{
    public static void permutate(String str,String prefix){
        if(str.length()==0)
            System.out.println(prefix);
        for(int i=0;i<str.length();i++){
            String rem = str.substring(0,i)+str.substring(i+1);
            permutate(rem,prefix+str.charAt(i));
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();
	    while(t-->0){
	       String str = in.nextLine();
	       permutate(str," ");
	    }      
		   
	}
}

