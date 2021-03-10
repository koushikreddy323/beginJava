class MyEmployee{
private int id;
private String name;
public void setId(int i){
        id=i;
        }
public int getId(){
        return id;
        }
public void setName(String s){
        name=s;
        }
public String getName(){
        return name;
        }

        }
class SettersAndGetters {
    public static void main(String[] args) {
        MyEmployee emp=new MyEmployee();
        emp.setId(40191);
        emp.setName("hello");
        System.out.println(emp.getId()+"  "+ emp.getName());

    }
}
