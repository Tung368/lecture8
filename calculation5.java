package lecture8;
public class calculation5 {
    void sum(int a,int b){System.out.println("int arg method invoked");}
    void sum(long a,long b){System.out.println("long arg method invoked");}
    public static void main(String[] args) {
        calculation5 obj=new calculation5();
        obj.sum(20,20);
    }
}
