//print first non repating character in a string
/*
geeksforgeeks
f
*/
import java.io.*;
import java.util.*;
import java.math.*;
public class MyClass {
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       String str =  in.nextLine();
       int[] count = new int[256];
       for(int i=0;i<str.length();i++){
           count[str.charAt(i)]++;
       }
       
       for(int i=0;i<str.length();i++){
           if(count[str.charAt(i)]==1){
               System.out.println(str.charAt(i));
               break;
           }
       }
        
    }

}
