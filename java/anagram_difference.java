import java.util.*;
import java.io.*;
public class MyClass {
    public static void anagrams(String s1,String s2){
        int[] count = new int[256];
        int f=0,c=0;
        Arrays.fill(count,0);
        for(int i=0;i<s1.length();i++)
            count[s1.charAt(i)]++;
        for(int i=0;i<s2.length();i++)
            count[s2.charAt(i)]--;
        for(int i=0;i<256;i++){
            if(count[i]!=0){
                f = 1;
                if(count[i]==1)
                    c++;
            }
        }
        if(f==1)
            System.out.println(c);
        else
            System.out.println(0);
              
    }
    public static void main(String[] ars){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        in.nextLine();
        String[] str1 = new String[x];
        for(int i=0;i<x;i++){
            str1[i] = in.nextLine();
        }
        int y = in.nextInt();
        String[] str2 = new String[y];
        in.nextLine();
        for(int i=0;i<y;i++){
            str2[i] = in.nextLine();
        }
        for(int i=0;i<x;i++){
            if(str1[i].length()!=str2[i].length()){
                System.out.println(-1);
            }else{
                anagrams(str1[i],str2[i]);
                }
            }
        
    }
}

