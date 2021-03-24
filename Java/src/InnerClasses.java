//There are three types of inner classes.
//Member inner class
//Static inner class
//Anonymous inner class

//-->Member inner class.
/*public class InnerClasses {
    public static void main(String[] args) {
        outer o=new outer();
        o.i=25;
        outer.inner i=o.new inner();      //Here to access the inner member class we need to specify the outer class (OuterClass.InnerClass)
                                         // and while obj creation we need to specify the outer class object(Here o)
        i.j=42;
    }
}

class outer{
    int i;
    class inner{
        int j;
    }
}

 */
//**********************************************
//-->Static inner class
/*public class InnerClasses {
    public static void main(String[] args) {
        outer.i=25;    //By declaring static to the instance variable in outer class and inner class as static. we can now access directly by declaring class name.variable.
        outer.inner i=new outer.inner();
        i.j=42;
    }
}

class outer{
    static int i;
    static class inner{
        int j;
    }
}
*/
//**********************************************
//->Anonymous inner class
//One way to get the method on in twice class is to inherit and override the method.
//other method is to use anonymous inner class
class InnerClasses{
    public static void main(String[] args) {
//        once o=new twice();     // One Way
//        o.on();
        once o=new once(){         //Other way--> this is anonymous class
            public void on(){
                System.out.println("twice class inherits once class");
            }
        };
        o.on();
    }
}
class once{
    public void on(){
        System.out.println("Once class");
    }
}
//class twice extends once{
//    public void on(){
//        System.out.println("twice class inherits once class");
//    }
//}