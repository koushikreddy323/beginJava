package swiftFood;

public class LinkedListChar {
    Node2 head;

    void insert(String data) {
        Node2 node = new Node2();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node2 n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }
int count=0;
    boolean search(String str){
        Node2 n=head;

        while (n.next!=null){
            count++;
            if(n.next.data.equals(str) || head.data.equals(str)){
                n=n.next;
                return true;
            }
            n=n.next;

        }
        return false;

    }
    void count(){
        System.out.println(count);
    }

    void show(){
        Node2 n=head;
        while(n.next!=null){
            System.out.println(n.data);
            n=n.next;
        }
        System.out.println(n.data);

    }

}
