package BinarySearch;
import java.util.*;

public class SquareRoot {
    public static int findSquareRoot(int num){
        int low=0,high=num;
        int result=-1;
        while(low<=high){
            int mid =low+(high-low)/2;
            long value=mid*mid;
            if(value==num){
                return mid;
            } 
            else if(value<num){
                result=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            }
            return result;
        }

    public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enetr number");
    int num=sc.nextInt();

    int result=findSquareRoot(num);
    System.out.println("Square root of given number: "+ result );
    }
    
}
