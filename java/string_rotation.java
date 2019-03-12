/*
Check for string rotation
Input :  s1 = "ABCD", s2 = "CDAB"
Output : True
String s1 is rotation of s2.
*/
import java.io.*;
import java.util.*;
import java.math.*;
public class MyClass {
   public static boolean areRotation(String s1,String s2){
       return ((s1.length()==s2.length())&&(s1+s1).contains(s2));
   }
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       String str1 =  in.nextLine();
       String str2 = in.nextLine();
       if(areRotation(str1,str2))
            System.out.println("YES");
        else
            System.out.println("NO");
        
    }

}
