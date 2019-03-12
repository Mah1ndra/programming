import java.util.*;
import java.io.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       String str = in.nextLine();
       int max = Integer.MIN_VALUE,n=str.length();
       char res = ' ';
       int[] count = new int[256];
       for(int i=0;i<n;i++){
           count[str.charAt(i)]++;
           if(max<count[str.charAt(i)]){
               max = count[str.charAt(i)];
               res = str.charAt(i);
           }
       }
      System.out.println(res);
    }
}

