//In Method overloading we can define name of methods identical but the input parameters should be different.
public class MethodOverloading {
    static void foo(){
        System.out.println("Hello there!");
    }
    static void foo(int a){                                //parameters
        System.out.println(a+" is an integer");
    }
    static void foo(int a,int b){
        System.out.println(a+" and "+b+" are integers");
    }

    public static void main(String[] args) {
        foo();
        foo(1);                           //arguments are real values
        foo(2,3);
    }


}
