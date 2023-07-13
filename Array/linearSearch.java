package Array;

import java.util.Scanner;

public class linearSearch {
    public static void main(String Args[]){
    Scanner sc=new Scanner(System .in);
    System.out .println("enter of size array");
     int n=sc.nextInt();

    System.out.println(" enter  Array ");
    int a[]=new int[n];

    for(int i=0; i<n;i++){
        a[i]=sc.nextInt();
    }System.out.println();
    
    System.out .println("enter key value");
    int x= sc.nextInt();



    int idx= -1;
    for(int i=0;i<n;i++){
        if(a[i]==x){
            idx=i;
            break; 
        }
    }
    if(idx==-1){
        System.out .println("array not found");    
    }
    else{
        System.out.println("array found"+ idx);
    }
}
}

    

