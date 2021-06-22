package Infy;

class Container<T>{
    private T t;

    public  void  set(T t){
        this.t=t;
    }
    public T get(){
        return t;
    }
}


public class GenericTypes {

    public static void main(String[] args) {

        Infy.Container<Integer> integerContainer = new Infy.Container<>();
        integerContainer.set(1);
        //integerContainer.set("Jeo");	//Uncomment the code and check if String can be passed to the set() method
        System.out.println("Inside Integer Container : "+integerContainer.get());

        Infy.Container<String> stringContainer = new Infy.Container<>();
        //stringContainer.set(1);	   //Uncomment the code and check if Integer can be passed to the set() method
        stringContainer.set("Jeo");
        System.out.println("Inside String Container : "+stringContainer.get());

        Infy.Container<Double> deo=new Infy.Container<>();
        deo.set(10.2);
        System.out.println(deo.get());

    }

}

