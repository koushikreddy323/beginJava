//Method Overriding is used when same method name is used in parent and child class. Then overriding comes to play and method in child class gets executed.
//Here method meth2 is same method that overrides in child class
class A{
    void meth2(){
        System.out.println("Meth 2 in class A");
    }
}
class B extends A{
    @Override
    void meth2() {
        System.out.println("meth 2 in class B");
    }
    void meth3(){
        System.out.println("meth 3 in class B");

    }
}
public class MethodOverriding {
    public static void main(String[] args) {
    B b=new B();
    b.meth2();
    b.meth3();

    }
}
