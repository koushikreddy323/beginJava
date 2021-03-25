//Creating your own queue class.
public class MyQueue {
    int front;
    int rear;
    int size;
    int [] queue=new int[5];

    public void enqueue(int data) {
        if (!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size = size + 1;
        } else {
            System.out.println("Stack is full");
        }
    }


    public int dequeue(){
        int data = queue[front];
        if(!isEmpty()) {
            front = (front + 1) % 5;
            size = size - 1;
        }
        else {
            System.out.println("Queue is Empty.!");
        }
        return data;
    }

    public int getSize(){ return size; }

    public boolean isEmpty(){ return getSize()==0; }

    public boolean isFull(){ return getSize()==5;}


    public void show(){
        System.out.print("elements: ");
        for(int i=0;i<size;i++){
            System.out.print(queue[(front+i)%5]+" ");

        }
        System.out.println();
        System.out.println("Array before dequeue and enqueue");
        for(int e:queue){
            System.out.print(e+" ");
        }
    }
}
