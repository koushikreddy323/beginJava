package Infy;
//Stack had only one end push and pop operations are performed to add and delete the data.
 class Stack1 {
    int top;
    int maxSize;
    int[] arr;
    int num;

    Stack1(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
        arr = new int[maxSize];
    }

    boolean isFull() {
        if (top >= (maxSize - 1)) {
            return true;
        }
        return false;
    }

    void push(int data) {
        if (top==maxSize-1)
            expand();
        arr[++top] = data;


    }

    int size(){
        return top;
    }

    void expand(){
        int length=size();
        int[] newStack=new int[maxSize*2];
        System.arraycopy(arr,0,newStack,0,length);
        arr=newStack;
        this.maxSize=maxSize*2;
        System.out.println("size is: "+maxSize);
    }

    int peek(){
        if(top<0){
            return Integer.MAX_VALUE;
        }
        else {
            return arr[top];
        }
    }

    boolean isEmpty() {
        if (top < 0) {
            return true;
        } else return false;
    }

    int pop() {
        if (isEmpty() == true) {
            return Integer.MIN_VALUE;
        } else
//            num = top;
//        top = top - 1;
        return arr[top--];
    }

    void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            for(int i=top;i>=0;i--){
                System.out.println(arr[i]);

            }
        }

    }

}
public  class Runn{
    public static void main(String[] args) {
        Stack1 s= new Stack1(4);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);
        s.push(100);
        s.push(120);
        s.push(130);
        s.push(140);
        s.display();
        System.out.println("size "+s.maxSize);
        System.out.println("------");
        s.pop();
        s.display();
    }
}
