package BinarySearch;
import java .util.*;

public class LowerBound {
 public static int findfirstoccurence(int arr[], int target){
int low=0,high=arr.length-1;
int result=-1;
while (low<=high){
    int mid=low+(high-low)/2;
    if(arr[mid]==target){
         result =mid;
         high=mid-1;
    }
    else if(arr[mid]>target){
        high=mid-1;
    }
    else{
        low=mid+1;
    }
}
return result;

    }   
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Array Size");
int n=sc.nextInt();

System.out .println("Enter Array" + " ");
int arr[]=new int [n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
System.out .println("Enter target element array");
int target=sc.nextInt();


int result=findfirstoccurence(arr,target);
if(result ==-1){
    System.out.println("target value not found");
}
else{
    System.out.println("target value found"  +   result);
}
   
    }
    
}
