package BinarySearch.Recursion;

import java.util.Scanner;

public class PowerNum {
    public static int powerNumber(int a, int b){
int result=0;
if(b==1){
    return a;
}
else{
    result=a*powerNumber(a,b-1);
    return result;
}
    }



    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int result=powerNumber(a,b);
        System.out .println("Power of these Numbers :"+result);

    }
    
}
    
