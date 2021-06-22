package Infy;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueInterfaceEX {
    public static Deque<Integer> changeSmallest(Deque<Integer> inputStack) {
        //Implement your logic here and change the return statement accordingly
        Deque<Integer> newD=new ArrayDeque<>();
        PriorityQueue<Integer> n=new PriorityQueue<>();
        n.addAll(inputStack);
        int s=n.peek();
        while (inputStack.size()!=0){
            int el=inputStack.removeLast();
            if(el==s){
                newD.addLast(el);
            }
            else {
                newD.addFirst(el);
            }
        }
        return newD;
    }

    public static void main(String[] args) {

        Deque<Integer> inputStack = new ArrayDeque<Integer>();
        inputStack.push(10);
        inputStack.push(8);
        inputStack.push(5);
        inputStack.push(12);
        inputStack.push(5);

        Deque<Integer> updatedStack = changeSmallest(inputStack);

        System.out.println("Stack After Modification:");
        for (Integer value : updatedStack)
            System.out.println(value);
    }
}
