package swiftFood;
//Queue has front and rear. Enqueue happens at the front and Dequeue happens at the rear.

public class Queue1{
    public static void main(String[] args) {
        Que q=new Que(5);
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);
        q.display();
        System.out.println("----------");
        q.deQueue();
        q.deQueue();
        q.display();

    }
}

class Que{
    int front;
    int rear;
    int maxSize;
    int [] queue;
    Que(int maxSize) {
        this.front = 0;
        this.rear = -1;
        this.maxSize = maxSize;
        queue=new int[maxSize];
    }

    boolean isFull(){
        if(rear>=maxSize){
            System.out.println("Queue is already full!");
            return true;
        }
        return false;
    }

    boolean enQueue(int data){
        if(isFull()){
            return false;
        }
        else {
            queue[++rear]=data;
            return  true;
        }
    }

    boolean isEmpty(){
        if(rear<0){
            return true;
        }
        return false;
    }

    boolean deQueue(){
        if(isEmpty()){
            return false;
        }
        else {
            front=front+1;
            return  true;
        }
    }

    void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else {
            for(int i=front;i<=rear;i++){
                System.out.println(queue[i]);
            }
        }
    }
}
