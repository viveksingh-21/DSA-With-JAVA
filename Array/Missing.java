package Array;

public class Missing {
    public static void main(String[]args){


    int arr[]={1,3,4,5};
    int n=arr.length;
    int sumNatural=((n+1)*(n+2)/2);
    int sum = 0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    int missing=sumNatural-sum;
    System.out.println(missing);
    
}
}


