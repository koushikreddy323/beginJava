class MyMainEmployee{
    private int id;
    private String name;
    public MyMainEmployee(){  //Creating a Constructor.
        id=45;
        name="your name";
    }
    public MyMainEmployee(String n){
        name=n;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
public class Constructors {
    public static void main(String[] args) {
        MyMainEmployee emp=new MyMainEmployee("koushik");
        System.out.println(emp.getId());
        System.out.println(emp.getName());

    }
}
