import java.util.*;
import java.io.*;
public class MyClass {
   public static void main(String[] ars){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        in.nextLine();
        String[] attendance = new String[n];
        for(int i=0;i<n;i++){
            attendance[i] = in.nextLine();
        }
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int c = 0;
            for(int j=0;j<m;j++){
                if(attendance[i].charAt(j)=='Y')
                        c++;
                else
                        c=0;
            }
            arr[i] = c;
        }
        int max = 0,c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==m){
                c++;
                max = Math.max(max,c);
            }else{
                c=0;
            }
        }
        System.out.println(max);
    }
}

