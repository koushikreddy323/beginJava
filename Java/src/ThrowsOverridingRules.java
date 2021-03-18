import java.io.IOException;

//Rule 1: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.

/*public class ThrowsOverridingRules {
    public static void main(String[] args) {
        child1 c=new child1();
        c.p1();
    }
}
class parent1{
    void p1(){
        System.out.println("no exception in parent class");
    }
}
class child1 extends parent1{
    void p1() throws IOException {            //Checked exception in subclass.
        System.out.println("child class");
    }
}

 */
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
//Rule 2: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but can declare unchecked exception.

/*class parent1{
    void p1(){
        System.out.println("parent");
    }
}
class child1 extends parent1{
    void p1() throws ArithmeticException{
        System.out.println("child class with unchecked exception");
    }
}

public class ThrowsOverridingRules {
    public static void main(String[] args) {
        child1 c=new child1();
        c.p1();
    }
}

 */
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
//Rule 3: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
/*public class ThrowsOverridingRules {
    public static void main(String[] args) {
        child1 c=new child1();
        try{
        c.p1();
        }
        catch(Exception e){}
    }
}

class parent1{
    void p1 ()throws ArithmeticException{
        System.out.println("parent");
    }
}

class child1 extends parent1{
    void p1() throws Exception{                    //Compile time error because of Rule 3
        System.out.println("child");
    }
}

 */
//Rule 3 cont...----------------------------------------------
/*public class ThrowsOverridingRules {
    public static void main(String[] args) {
        child1 c=new child1();
        try{
            c.p1();
        }
        catch (Exception e){}
    }
}

class parent1{
    void p1 ()throws Exception{
        System.out.println("parent");
    }
}

class child1 extends parent1{
    void p1() throws Exception{
        System.out.println("child");
    }
}

 */
//------------------------------------------------------------
/*public class ThrowsOverridingRules {
    public static void main(String[] args) {
        child1 c=new child1();
        try{
            c.p1();
        }
        catch (Exception e){}
    }
}

class parent1{
    void p1 ()throws Exception{
        System.out.println("parent");
    }
}

class child1 extends parent1{
    void p1() throws ArithmeticException{
        System.out.println("child");
    }
}

 */
//------------------------------------------------------------
public class ThrowsOverridingRules {
    public static void main(String[] args) {
        child1 c=new child1();
        try{
            c.p1();
        }
        catch (Exception e){}
    }
}

class parent1{
    void p1 ()throws Exception{
        System.out.println("parent");
    }
}

class child1 extends parent1{
    void p1() {                          //No exception used in child class.
        System.out.println("child");
    }
}

