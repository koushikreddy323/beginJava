package Infy;

public class Tester {
    public static void main(String[] args) {
        long[]restrauntContacts={785462,84652,87455};
        restrauntContacts[0]=55;
        Restraunt r=new Restraunt(restrauntContacts);
        r.displayRestrauntDetails();

    }
}

class Restraunt{
    String restrauntName;
    final long [] restrauntContacts;
    final String restrauntAddress;
    final float rating;
    final String name;
    Restraunt(long[] restrauntContacts){
        this.name= "McDonalds";
        this.restrauntAddress= "Bakers street, London";
        this.restrauntContacts =restrauntContacts;
        this.rating= (float) 4.8;


    }
    public void displayRestrauntDetails(){
        System.out.println("Restraunt Details\n******************");
        System.out.println("Restraunt Name: "+restrauntName);
        System.out.println("Restraunt Rating: "+rating);
        System.out.println("Restraunt Contact: ");
        for (long restrauntContact : restrauntContacts) {
            System.out.println(restrauntContact);
        }
        System.out.println("Restraunt Address: "+restrauntAddress);
    }

}


class Order1{
    int orderId=101;
    String orderedFoods="spinash";
    double totalPrice;
    String status="ordered";

}
