import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Codechef
{
    public static void subsequence(String str,int n){
        HashSet<String> hs = new HashSet<String>();
        int size = 1<<n;
        for(int i=1;i<size;i++){
            String temp = "";
            for(int j=0;j<n;j++){
                if(BigInteger.valueOf(i).testBit(j)){
                    temp += str.charAt(j);
                }
               
            }
            int len = temp.length();
            if((temp.charAt(0)=='a'||temp.charAt(0)=='e'||temp.charAt(0)=='i'|| temp.charAt(0)=='o'||temp.charAt(0)=='u')&&!(temp.charAt(len-1)=='a'||temp.charAt(len-1)=='e'||temp.charAt(len-1)=='i'|| temp.charAt(len-1)=='o'||temp.charAt(len-1)=='u'))
                if(!hs.contains(temp)){
                    hs.add(temp);
                    System.out.println(temp);
                }
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    in.nextLine();
	    while(t-->0){
	        String str = in.nextLine();
	        subsequence(str,str.length());
	    }
	}
}

