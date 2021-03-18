import java.io.IOException;

/*public class ThrowAndThrows {
    public static void main(String[] args) {
        testThrow f=new testThrow();
        f.test(27);

    }
}

class testThrow{
    public void test(int a){

        if (a<25){
            throw new ArithmeticException("not valid");

        }
        else {
            System.out.println("Welcome to adulthood!");
        }
    }
}

 */



class M{
    void method() throws IOException{              //This is just a declaration of exception. It does not throw exception.
        throw new IOException("device error");      //Here the exception is thrown.
    }
}
public class ThrowAndThrows {
    public static void main(String[] args) {
        try{
            M m=new M();
            m.method();
        }
        catch (Exception e){
            System.out.println("Exception handiled.");
        }
        finally {
            System.out.println("End of program");
        }
    }
}
