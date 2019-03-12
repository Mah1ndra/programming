/*
Alice wrote a sequence of words in CamelCase as a string of letters, having the following properties:

1.	It is a concatenation of one or more words consisting of English letters.
2.	All letters in the first word are lowercase. 
3.	For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.

Given String S, print the number of words in on a new line.
Sample Input
saveChangesInTheEditor

Sample Output
5
*/
import java.util.*;
import java.io.*;
import java.math.*;
public class MyClass {
   public static int wordCount(String str,int n){
       int count = 0;
       for(int i=0;i<n;i++){
           if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
                    count++;
       }
       return count+1;
   }
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       String str = in.nextLine();
       System.out.println(wordCount(str,str.length()));
    }
}


