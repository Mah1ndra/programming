import java.util.*;
import java.io.*;
public class MyClass {
    public static String breakPal(String str){
        char[] carr = str.toCharArray();
        StringBuilder sb = new StringBuilder(str);
        int n = sb.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(sb.charAt(i) > carr[j]){
                    sb.setCharAt(i,carr[j]);
                    return sb.toString();
                }
            }
        }
        return sb.toString();
    }
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       String str = in.nextLine();
       String temp = breakPal(str);
       StringBuffer sb = new StringBuffer(temp);
       if(str.equals(sb.reverse().toString()))
            System.out.println("IMPOSSIBLE");
        else
            System.out.println(temp);
        
       
    }
}

