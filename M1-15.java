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

//31[M3] recursive fibonacci
import java.util.*;

public class Fibonacci {
    public static int generator(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
             return 1;
        else
            return generator(n - 1) + generator(n - 2);
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        for(int i=0;i<n;i++)
            System.out.print(generator(i)+" ");
        in.close();
    }
}


//54[M4] inheritance
import java.util.*;
public interface A{
    public void amethod1(String data);
    public void amethod2(String data);
}
public interface B{
    public void bmethod1(String data);
    public void bmethod2(String data);
}
public interface C{
    public void cmethod1(String data);
    public void cmethod2(String data);
}
public interface Alpha extends A,B,C{
   void alphaMethod(String data);
}
public class Example implements Alpha {
    
    
     public void amethod1(String data){
           System.out.println(data);
       }
       public void bmethod1(String data){
           System.out.println(data);
       }
       public void cmethod1(String data){
           System.out.println(data);
       }
       public void alphaMethod(String data){
           System.out.println(data);
       }
    public static void callAmethod1(A a,String data){
        a.amethod1(data);
    }
    public static void callAmethod2(B b,String data){
        b.bmethod1(data);
    }
    public static void callAmethod3(C c,String data){
        c.cmethod1(data);
    }
    public static void callAmethod4(Alpha al,String data){
        al.alphaMethod(data);
    }
    public static void main(String args[]) {
      callAmethod1(new Example(),"Method call 1" );
      callAmethod2(new Example(),"Method call 2" );
      callAmethod3(new Example(),"Method call 3" );
      callAmethod4(new Example(),"Method call 4" );
    }
}


//60[M5] inheritance
import java.util.*;
public class Test
{
    Test(){
        System.out.println("Test...");
    }
    Test t = new Test();
    public static void main(String args[])
    {
        Test test = new Test();
    }
}


//69[M8] Enumeration
import java.util.*;

interface Operator{
    int calculate(int firstOperand, int secondOperand);
}
 enum EOperator implements Operator{
    SUM {
        @Override
        public int calculate(int firstOperand, int secondOperand){
            return firstOperand + secondOperand;
        }
    },
    SUBTRACT {
        @Override
        public int calculate(int firstOperand, int secondOperand){
            return firstOperand - secondOperand;
        }
    };
}
 class Operation{
    private int firstOperand;
    private int secondOperand;
    private EOperator operator;
    
    public Operation(int firstOperand, int secondOperand, EOperator operator){
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operator = operator;
    }
    public int calculate(){
        return operator.calculate(firstOperand, secondOperand);
    }
}
 public class MyClass {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int op1 = in.nextInt();
        int op2 = in.nextInt();
        Operation sum = new Operation(op1, op2, EOperator.SUM);
        Operation subtract = new Operation(op1, op2, EOperator.SUBTRACT);
        
        System.out.println("Sum: "+sum.calculate());
        System.out.println("Subtract: "+subtract.calculate());
    }
}



//18[M16] I/0



//FileCopyUsingFileChannel.java

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class FileCopyUsingFileChannel {

    public static void main(String[] args) throws Exception{

        String thisFile = "./src/tips/nio/copyusingfc/FileCopyUsingFileChannel.java";
        FileInputStream source = new FileInputStream(thisFile);
        FileOutputStream destination = new FileOutputStream("Output.java");

        FileChannel sourceFileChannel = source.getChannel();
        FileChannel destinationFileChannel = destination.getChannel();

        long size = sourceFileChannel.size();
        sourceFileChannel.transferTo(0, size, destinationFileChannel);
    }
}

