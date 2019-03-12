import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        int f = 1,c=0;
        while(f==1){
            c++;
            int k=0;
            Arrays.sort(arr);
            for(int i=0;i<n-1;i++)
                arr[i]++;
            for(int i=0;i<n-1;i++)
                if((arr[i]==arr[i+1]))
                    k++;
            if(k==n-1)
                f=0;
        }
        System.out.println(c);
    }
}

