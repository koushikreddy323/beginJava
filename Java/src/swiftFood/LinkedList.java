package swiftFood;

public class LinkedList {
//    Node1 head;
//
//    void insert(int data){
//        Node1 node=new Node1();
//        node.data=data;
//        node.next=null;
//
//        if(head==null){
//            head=node;
//        }
//        else {
//            Node1 n=head;
//            while(n.next!=null){
//                n=n.next;
//            }
//            n.next=node;
//        }
//    }
//
//    void insertAStart(int data){
//        Node1 node=new Node1();
//        node.data=data;
//        node.next=null;
//        node.next=head;
//        head=node;
//    }
//
//    void insertAt(int index,int data){
//        Node1 node=new Node1();
//        node.data=data;
//        node.next=null;
//
//        Node1 n=head;
//        if(index==0){
//            insertAStart(data);
//        }
//        else {
//            for (int i = 0; i < index - 1; i++) {
//                n = n.next;
//            }
//
//            node.next = n.next;
//            n.next = node;
//        }
//    }
//
//    void deleteAt(int index){
//        if(index==0){
//            head=head.next;
//        }
//        else {
//            Node1 n=head;
//            Node1 n1=null;
//            for(int i=0;i<index-1;i++){
//                n=n.next;
//            }
//            n1=n.next;
//            n.next=n1.next;
//            n1=null;
//        }
//    }
//
//    void show(){
//        Node1 node=head;
//        while(node.next!=null){
//            System.out.println(node.data);
//            node=node.next;
//        }
//        System.out.println(node.data);
//    }

    Node1 head;
    void insert(int data){
        Node1 node=new Node1();
        node.data=data;
        node.next=null;
        if(head==null){
            head=node;
        }
        else {
            Node1 n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }

    void insertAtStart(int data){
        Node1 node=new Node1();
        node.next=null;
        node.data=data;
        node.next=head;
        head=node;
    }

    void show(){
        Node1 n=head;
        while(n.next!=null){
            System.out.println(n.data);
            n=n.next;
        }
        System.out.println(n.data);
    }

    void insertAt(int index,int element){
        Node1 node=new Node1();
        node.next=null;
        node.data=element;
        Node1 n=head;

        for(int i=0;i<index-1;i++){
            n=n.next;

        }
        node.next=n.next;
        n.next=node;

    }

    void deleteAt(int index){
        Node1 n= head;
        Node1 n1=null;

        if(index==0){
            head=head.next;
        }
        else {
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            n1 = n.next;
            n.next = n1.next;
        }

    }

}
