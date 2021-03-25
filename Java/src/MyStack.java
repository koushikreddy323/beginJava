//Stack is an in-built class in java.
//Here we are creating our own class and its methods like push,pop,etc.
public class MyStack {
    int capacity=2;
    int []stack=new int[capacity];
    int top=0;
    public void push(int data) {
        if (size() == capacity) {
            expand();
        } else {
            stack[top] = data;
            top++;
        }
    }

    private void expand() {
        int length=size();
        int []newstack=new int[capacity*2];
        System.arraycopy(stack,0,newstack,0,length);
        stack=newstack;
        capacity=capacity*2;
    }

    public int pop() {
        int data=0;
        if (isEmpty()) {
            System.out.println("Stack is empty..");
        } else {

            top--;
            data = stack[top];
            stack[top] = 0;
            shrink();
        }
            return data;

    }

    private void shrink() {
        int length=size();
        if(length<=(capacity/2)/2){
            capacity=capacity/2;
            int [] newstack=new int[capacity];
            System.arraycopy(stack,0,newstack,0,length);
            stack=newstack;
        }
    }

    public int size(){ return top; }

    public boolean isEmpty(){
        return top<=0;
    }

    public void show(){
        for(int e:stack){
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
