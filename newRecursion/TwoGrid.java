package newRecursion;

public class TwoGrid {
    public static void Grid(int cc,int cr,int dc,int dr,String ans){
        if(cc>dc|| cr>dr){
            return;
        }
        if(cr==dr&&cc==dc){
            System.out.println(ans);
            return;
        }
        Grid(dr,dc,cc+1,cr,ans+ 'H');
        Grid(dc,dr,cr+1,cc,ans+ 'V');
    }
    public static void main(String args[]){
        Grid(0,0,3,3,"");

    }
    
}
