/*
test1: 
6
1 1 5 2 5 5
ans: 1


*/
import java.io.*;
import java.util.*;
import java.math.*;
public class MyClass {
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int c = 0;
       int[] arr = new int[n];
       for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
       for(int i=1;i<n-1;i++){
           if(arr[i-1]==arr[i]){
                    c++;
                    int t = arr[i-1];
                    arr[i-1] =arr[n-i-1];
                    arr[n-i-1] = t;
           }
           if(arr[i]==arr[i+1]){
                     c++;
                    int t = arr[i];
                    arr[i] =arr[n-i-1];
                    arr[n-i-1] = t;
           }
       }
       /*for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");*/
        System.out.println(c);
}

}
