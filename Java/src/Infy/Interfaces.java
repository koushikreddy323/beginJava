package Infy;
/*
Interface in java: It is a blueprint of a class which contains the
abstract methods, static methods,default methods & public static final variable.
Interface helps to achieve 100% abstraction
any method inside an interface is by default considered as public abstract
We cannot create the object of an interface directly.
But indirectly we can create the object of an interface

Rules of an interface:
1. If a class has to attain the properties and behaviour of an interface then the class must
    implement the interface using "implements" keyword
2. In interface we can achieve multiple inheritance as one class can implement multiple interfaces
3. We cannot directly create the object of an interface
4. We can indirectly create the object of an interface using anonymous inner types
5. We can directly create the reference of an interface
6. We cannot implement one interface from another interface
7. We can have extends relationship between 2 interfaces
8. If a class partially implements an interface then it must declare itself as abstract
9. Any method inside the interface is by default considered as public abstract
10.We can have default method (specified with default keyword) and static method  (specified with default keyword)
    inside an interface.
11.Any variable inside an interface is considered as public static final and its value remains un-alte
12.We can have an empty interface in java such interface is called as marker interface
13.If a class extends another class and also implements an interface in such case the class must
    ---> extend the other class first and
    ---> then implement the other interface
 */



interface Animal1{
    void eat();
    void sleep();
    void size();
}
class Tiger1 implements Animal1{
    @Override
    public void eat(){
        System.out.println("Tiger eats meat");
    }
    @Override
    public void sleep(){
        System.out.println("Tiger is sleeping");
    }

    @Override
    public void size() {
        System.out.println("Size of Tiger");
    }
}

class Deer1 implements Animal1 {
    @Override
    public void eat(){
        System.out.println("Deer eats Trees and leaves");
    }
    @Override
    public void sleep(){
        System.out.println("Deer is sleeping");
    }

    @Override
    public void size() {
        System.out.println("Size of Deer");
    }
}

class Monkey1 implements Animal1 {
    @Override
    public void eat(){
        System.out.println("Monkey eats bananas");
    }
    @Override
    public void sleep(){
        System.out.println("Monkey sleeps");
    }

    @Override
    public void size() {
        System.out.println("Size of Monkey");
    }
}

class Forest1 {
    void permit( Animal1 a){
        a.sleep();
        a.eat();
        a.size();
        System.out.println("-------------");
    }


}
public class Interfaces {
    public static void main(String[] args) {
        Tiger1 t=new Tiger1();
        Deer1 d=new Deer1();
        Monkey1 m=new Monkey1();
        Forest1 f=new Forest1();
        f.permit(t);
        f.permit(d);
        f.permit(m);

    }
}



