import java.util.*;
import java.io.*;
public class MyClass {
   public static int evenSubArray(int[] arr,int n,int k){
       int res = 0;
       HashSet<String> hs = new HashSet<String>();
       for(int i=0;i<n;i++){
           for(int j=i;j<n;j++){
               int oc=0;
               String s = "";
               for(int z=i;z<=j;z++){
                   s += arr[z];
                   if(!(arr[z]%2==0))
                        oc++;
               }
               if(!hs.contains(s))
                    if(oc<=k)
                        res++;
                hs.add(s);
           }
       }
       return res;
   }
   public static void main(String[] ars){
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<n;i++)
            arr[i]= in.nextInt();
       int k = in.nextInt();
       System.out.println(evenSubArray(arr,n,k));
            
    }
}


