public class MyClass {
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int max = Integer.MIN_VALUE;
       int n = in.nextInt();
       int x = in.nextInt();
       int[] bundleQuantity = new int[x];
       for(int i=0;i<x;i++){
           bundleQuantity[i] = in.nextInt();
            max = Math.max(max,bundleQuantity[i]);
       }
       int y = in.nextInt();
       int[] bundleCost = new int[y];
       for(int j=0;j<y;j++){
           bundleCost[j] = in.nextInt();
       }
       for(int i=0;i<x;i++){
           int cost = n/bundleCost[i];
           cost = cost * bundleQuantity[i];
           max = Math.max(max,cost);
       }
       System.out.println(max);
    }
}

