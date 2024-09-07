package lecture8;
public class Student {
    int ID;
    String name;
    public Student(int ID, String name){
        this.ID=ID;
        this.name=name;
    }
    void displayinfomation(){
        System.out.println("ID"+ID+",name: "+name);
    }
    public static void main(String[] args) {
        Student student1=new Student(1,"Nam");
        Student student2=new Student(2,"Lan");
        student1.displayinfomation();
        student2.displayinfomation();

    }
    
}
