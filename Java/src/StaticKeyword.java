//Static Keyword is the memory of the variable is only created once in a class when the object is called.
//By defining static we can use the variable data to other classes.
class stic {
    int id ;
    String name;
    static String ceo;
    public void show() {
        System.out.println(id +"  "+name+" "+ceo);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        stic s1=new stic();
        s1.id=191;
        s1.name="john";
        stic.ceo="Larry";

        stic s2=new stic();
        s2.id=110;
        s2.name="cena";

        s1.show();
        s2.show();
    }
}
