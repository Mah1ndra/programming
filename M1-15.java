//15[2] pascal triangle
import java.util.*;
public class PascalTriangle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt(),number=1;
        for(int i=0;i<n;i++){
            for(int k=n;k>i;k--){
                    System.out.print(" ");
            }
            number = 1;
            for(int j=0;j<=i;j++){
                System.out.print(number+" ");
                number = number * (i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
