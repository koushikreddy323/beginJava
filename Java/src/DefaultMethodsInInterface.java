//Default method is used to add a new method in interface
//Class(MySmartphone) implementing the interface(MyCamera) need not implement the default methods.
//Default method should define the functionality in interface itself.
public class DefaultMethodsInInterface {
    public static void main(String[] args) {
        MySmartphone sm=new MySmartphone();
        sm.fastCharge();
        String[] arr=sm.gettingNetworks();
        for(String item:arr){
            System.out.println(item);
        }
    }
}

interface MyCamera{
    void getSnap();
    void editSnap();
    default void fastCharge(){                                  //Default Method.
        System.out.println("Default method is executed...!");
    }
    }

interface MyWifi{
    String[] gettingNetworks();
    void connectingNetworks();
}

class Myphone {
    void calling(int phonenumber){
        System.out.println("calling..."+phonenumber);
    }
    void picking(){
        System.out.println("Connecting");
    }
}

class MySmartphone extends Myphone implements MyWifi,MyCamera{
    @Override
    public void getSnap() {
        System.out.println("Getting Snap...");
    }

    @Override
    public void editSnap() {
        System.out.println("editing snap...");
    }

    @Override
    public String[] gettingNetworks() {
        System.out.println("Getting networks...");
        String[] list={"Airtel5G","Jio5G","Airtel Broadband"};
        return list;
    }

    @Override
    public void connectingNetworks() {
        System.out.println("Connecting to network...");
    }
}
