package newRecursion;

public class pathDest {
    public static void PrintPath(int cur,int desit,String path){
        if(cur>desit){
            return;
        }
        if(cur==desit){
            System.out.println(path);
            return;
        }
        PrintPath(cur+1,desit,path+1);
        PrintPath(cur+2,desit,path+2);
        PrintPath(cur+3,desit,path+3);
        PrintPath(cur+4,desit,path+4);
        PrintPath(cur+5,desit,path+5);
        PrintPath(cur+6,desit,path+6);
    }
    public static void main(String args[]){
        PrintPath(0,9,"");
    }
    
}
