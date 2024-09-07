package lecture8;
public class calculation4 {
    void sum(int a,long b){System.out.println(a+b);}
    void sum(int a,int b,int c){System.out.println(a+b+c);}
    public static void main(String[] args) {
        calculation4 obj=new calculation4();
        obj.sum(20,20);
        obj.sum(20,20,20);
    }
}
    
