//Here at A we have created a subclass for Aa and overridden method show().
//We can do it with help of anonymous inner class . shown at B
//If you are trying only to override the subclass method ,then use anonymous class.
//Same with the interface as well.
class Aa{
    void show(){
        System.out.println("Inner class");
    }
}

//interface AA{ void show();}


/*class Bb extends Aa{
    @Override
    void show() {
        System.out.println("subclass");
    }
}

 */

public class AnonymousClass {
    public static void main(String[] args) {
        Aa obj=new Aa()
        {
            public void show() {
                System.out.println("subclass");
            }
        };
        obj.show();
    }
}
