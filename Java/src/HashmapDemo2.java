import java.util.HashMap;
import java.util.Map;

public class HashmapDemo2 {
    public static void main(String[] args) {
        HashMap<Integer,Book> map=new HashMap<>();
        Book b1=new Book(101,"Life of Pie","Steven Spielberg","Disney",102);
        Book b2=new Book(201,"Let's C ","Robert","Oracle",142);
        Book b3=new Book(301,"Python for Life","James C","Oracle corp",241);
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);
        for(Map.Entry<Integer,Book> e:map.entrySet()){
            int key=e.getKey();
            Book b=e.getValue();
            System.out.println(key+" Details");
            System.out.println("Id:"+b.id +"  "+b.name+"  "+b.author+"  "+b.publisher+"  "+b.quantity);


        }

    }
}

class Book{
    int id;
    String name;
    String author;
    String publisher;
    int quantity;
    public Book(int id,String name,String author,String publisher,int quantity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
    }
}

