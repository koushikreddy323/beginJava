//Inheritance in Interfaces
public class InheritanceInInterface {
    public static void main(String[] args) {
        SampleClass sc=new SampleClass();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();

    }
}

interface parentClass{
    void meth1();
    void meth2();
}
interface childClass extends parentClass{
    void meth3();
    void meth4();
}

class SampleClass implements childClass{
    @Override
    public void meth1() {
        System.out.println("Method 1");
    }
    public void meth2() {
        System.out.println("Method 2");
    }
    public void meth3() {
        System.out.println("Method 3");
    }
    public void meth4() {
        System.out.println("Method 4");
    }
}
