package newRecursion;

public class BalPara {
    public static void PrintBal(int n,int oc ,int cc,String ans){
        if(oc==n&&cc==n){
            System.out.println(ans);
            return;
        }
        if(oc<n){
            PrintBal(n,oc+1,cc,ans+'(');
        }
        if(oc>cc){
            PrintBal(n,oc,cc+1,ans+')');
        }
    }
    public static void main(String[] args){
        PrintBal(2,0,0,"");
    }
    
}
