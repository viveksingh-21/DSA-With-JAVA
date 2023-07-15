package BinarySearch.Recursion;
import java.util.*;

public class factorial {
    public static int  factorialNum(int n){
        int result=0;
        if(n<=1){
            return 1;
        }
        else{
           result =n*factorialNum(n-1);
            return result;
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        int result=factorialNum(n);
        System.out .println("factorial number :"+result);

    }
    
}
