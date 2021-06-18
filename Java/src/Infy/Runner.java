package Infy;

public class Runner {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insertAtStart(100);
        l.insertAt(2,200);
        //l.insertAt(0,85);
        l.deleteAt(1);
        l.show();

        LinkedListChar lc=new LinkedListChar();
//        lc.insert("AB");
//        lc.insert("AC");
//        lc.insert("AD");
//        lc.insert("DE");
//        lc.insert("UJ");
//
//       lc.search("DE");
//       lc.count();
//
//
//        lc.show();
    }
}
