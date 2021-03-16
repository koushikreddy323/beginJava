class phone{
    public void music(){
        System.out.println("Playing music....");
    }
    public void name(){
        System.out.println("My name is Phone");
    }

}

class smartphone extends phone{
    @Override
    public void name(){
        System.out.println("My name is Smartphone");
    }
    public void yt(){
        System.out.println("Opening Youtube...");
    }
}


public class DynamicMethodDispatch {
    public static void main(String[] args) {
      /*  smartphone sm=new smartphone();
        sm.name();   //Here the name method will be executed from the child class as method overriding happens
        sm.music();

       */
        phone p=new smartphone();   //Here the class on left should be parent class and constructor should be child class. The vice-versa is not allowed.
        p.music();
        p.name();
        //p.yt();  not allowed here because it is in a child class

    }
}
