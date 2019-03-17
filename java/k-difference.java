import java.util.*;
public class MyClass {
    public static int binSearch(int[] arr,int low,int high,int k){
        if(high>=low){
            int mid = low+(high-low)/2;
            if(arr[mid]==k)
                return mid;
            else if(arr[mid]>k)
                return binSearch(arr,low,mid-1,k);
            else
                return binSearch(arr,mid+1,high,k);
        }
        return -1;
    }
    public static int distinctPair(int[] arr,int n,int k){
        int count = 0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if((binSearch(arr,i+1,n-1,arr[i]+k)!=-1))
                count++;
        }
        return count;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        System.out.println(distinctPair(arr,n,k));
    }
}

