//Abstract classes are declared not defined. An abstract class can have abstract and non abstract methods.
//If a method in a class is abstract,then the class is abstract.
//We cannot create objects for abstract class.

public class AbstractClasses {
    public static void main(String[] args) {
        //Phone p=new Phone();              //Cannot instantiate Phone as it is an abstract class
        //BasicPhone b=new BasicPhone();   // Same as above it's an abstract class.
        SmartPhone s=new SmartPhone();     //This is a concrete class. So object can be created.
        s.Ai();
        s.FastCharge();
        s.call();
        s.OTT();
    }
}

abstract class Phone
{
    public void call()
    {
        System.out.println("Calling...");
    }
    public abstract void Ai();
    public abstract void OTT();
    public abstract void FastCharge();
}

abstract class BasicPhone extends Phone
{
    @Override
    public void OTT()
    {
        System.out.println("OTT will be available in Smart Phones");
    }
}

class SmartPhone extends BasicPhone{
    @Override
    public void Ai() {
        System.out.println("Artificial Intelligence is activated!");
    }

    @Override
    public void FastCharge() {
        System.out.println("Fast Charge can be used");
    }
}





