//If at all constructor is not defined then the default constructor will be activated.
//To change the default constructor we can create one. The name of constructor should have same name as the class.


class MyMainEmployee{
    private int id;
    private String name;
    public MyMainEmployee(){      //defining constructor
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
        MyMainEmployee emp=new MyMainEmployee("koushik");    //MyMainEmployee on rhs is a constructor for the obj emp.
        System.out.println(emp.getId());
        System.out.println(emp.getName());

    }
}
