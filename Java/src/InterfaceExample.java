// Interface is like a blueprint of a class.
//All the methods in a interface are abstract,final (the value is fixed and can't be changed) and public by default
//Abstract classes vs interface is that abstract classes cannot be multiple extended but interfaces can be extended,they are made of dynamic dispatch.
public class InterfaceExample {
    public static void main(String[] args) {
        //Mercedes m=new cars();
        //m.model();
        cars c= new cars();
        c.make();
        c.model();
    }
}

interface Mercedes{
    void model();
}

interface Audi{
    void make();
}

class cars implements Mercedes,Audi{
    public void model(){
        System.out.println("Mercedes G-Class");
    }
    public void make(){
        System.out.println("Audi Q8");
    }
}
