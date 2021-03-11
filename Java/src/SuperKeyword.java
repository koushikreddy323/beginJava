class Animal{
    Animal(){
        System.out.println("This is parent class");
    }
}
class Dog extends Animal{
    Dog(){
        super();          //refers the immediate parent class
        System.out.println("This is child class");
    }
}


public class SuperKeyword {
    public static void main(String[] args) {
        Dog d=new Dog();
    }
}
