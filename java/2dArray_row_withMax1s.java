public class MyClass {
    public static int search(int[] arr,int low ,int high){
        if(high>=low){
            int mid = low + (high-low)/2;
            if(mid == 0|| (arr[mid-1]==0)&&(arr[mid]==1))
                return mid;
            else if(arr[mid]==0)
                    return search(arr,mid+1,high);
            else
                return search(arr,low,mid-1);
        }
        return -1;
    }
    public static int rowWithMax1s(int[][] mat,int r,int c){
        int mindex=0,max=-1;
        for(int i=0;i<r;i++){
            int index = search(mat[i],0,c-1);
            if(index!=-1&&c-index > max){
                max = c - index;
                mindex = i;
            }
        }
        return mindex;
    }
    public static void main(String args[]) {
       //Scanner in = new Scanner(System.in);
       int mat[][] = { { 0, 0, 0, 1 }, 
                        { 0, 1, 1, 1 }, 
                        { 1, 1, 1, 1 }, 
                        { 0, 0, 0, 0 } }; 
        System.out.println(rowWithMax1s(mat,4,4));
    }
}

