//print first repating character in a string
import java.io.*;
import java.util.*;
import java.math.*;
public class MyClass {
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       String str =  in.nextLine();
       int[] count = new int[256];
       for(int i=0;i<str.length();i++){
           if(count[str.charAt(i)] > 0){
               System.out.println(str.charAt(i));
               break;
           }
           count[str.charAt(i)]++;
       }
}

}
