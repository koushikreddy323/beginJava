//Polymorphism in interfaces is when we create obj of smartphone to Mycamera then we can use methods in MyCamera only.
public class PolymorphismInInterfaces {
    public static void main(String[] args) {
        MyCamera2 cam1=new MySmartphone2();
        cam1.getSnap();
        MySmartphone2 smphone=new MySmartphone2();
        String[] arr=smphone.gettingNetworks();
        for(String item:arr){
            System.out.println(item);
        }
    }
}

interface MyCamera2{
    void getSnap();
    void editSnap();
    default void fastCharge(){                                  //Default Method.
        System.out.println("Default method is executed...!");
    }
}

interface MyWifi2{
    String[] gettingNetworks();
    void connectingNetworks();
}

class Myphone2 {
    void calling(int  phonenumber){
        System.out.println("calling..."+phonenumber);
    }
    void picking(){
        System.out.println("Connecting");
    }
}

class MySmartphone2 extends Myphone2 implements MyWifi2,MyCamera2{
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

