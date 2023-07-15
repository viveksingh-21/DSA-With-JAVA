package BinarySearch.Recursion;

import java.util.Scanner;

public class fibonacci {
    public static int fibonacciNum(int  n){
        int result=0;
        if(n<=1){
            return 1;
        }
        else{
             result=(n-1)*fibonacciNum(n-2);
            return result;
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        int result=fibonacciNum(n);
        System.out .println("factorial number :"+result);

    }
    
}
    
