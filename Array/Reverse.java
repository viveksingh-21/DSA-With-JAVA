package Array;

public class Reverse {
    public static void main(String[] agrs){
        int arr[]={1,2,3,4,5};
        int n= arr.length;
        for (int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out .println("reverse array");
        for(int i=0;i<n;i++){
            System.out .print(arr[i]);
        }


    }
    
}
