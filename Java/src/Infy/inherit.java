package Infy;


/*
class Player1 extends Object{
    String name;//messi ---> ronaldo
    String country;//Argentina ---> Portugal
    int age;//33 ---> 35

    public Player1(){
        super();
        System.out.println("Inside Player constructor");
        name="messi";
        country="Argentina";
        age=33;
    }
    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public int getAge() {
        return age;
    }

}
class FootBaller extends Player1{
    FootBaller(String name,String country,int age){
        super();
        System.out.println("Inside Footballer constructor");
        this.name=name;
        this.country=country;
        this.age=age;
    }
    void disp() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(country);
    }
}
*/
/*
public class inherit {
    public static void main(String[] args) {
        FootBaller f1 = new FootBaller("Neymar", "Brazil", 30);
//        System.out.println(f1.getName());//ronaldo
//        System.out.println(f1.getCountry());//portugal
//
//        System.out.println(f1.getAge());//35
        f1.disp();
    }
}





class Player1 extends Object{
    String name;// ronaldo
    String country;// Portugal
    int age;// 35

    public Player1(String name,String country,int age){
        super();
        System.out.println("Inside Player constructor");
        this.name=name;
        this.country=country;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public int getAge() {
        return age;
    }

}
class FootBaller extends Player1{
    public FootBaller(String name,String country,int age){
        super(name,country,age);
        System.out.println("Inside Footballer parameterised constructor");

    }
    public FootBaller() {
        this("messi","argentina",33);
        System.out.println("Inside Footballer zero parameterised constructor");
    }
    void disp() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(country);
    }
}

 */

class inherit{
    public static void main(String[] args) {
cargoPlane cp=new cargoPlane();
passengerPlane pp=new passengerPlane();
cp.name="Messi";
        System.out.println("Cargo plane details: ");
        System.out.println(cp.name);
        cp.fly();
        cp.land();
        cp.carryGoods();
        cp.takeoff();
        System.out.println("-------------------------");
        System.out.println("passenger plane details");
        pp.fly();
        pp.land();
        pp.carryPassengers();
        pp.takeoff();
    }
}

class plane{
    String name;
    void takeoff(){
        System.out.println("plane is taking off");
    }
    void fly(){
        System.out.println("plane flys at high heights");
    }
    void land(){
        System.out.println("plane lands");
    }
}

class cargoPlane extends plane{

    @Override
    void fly() {
        System.out.println("Cargo plane flys at low height");;
    }
    void carryGoods(){
        System.out.println("Cargo plane carry goods");
    }
}

class passengerPlane extends plane{
    @Override
    void fly() {
        System.out.println("Passenger plane flys at medium heights");
    }
    void carryPassengers(){
        System.out.println("Passenger plane carrys passengers");
    }
}