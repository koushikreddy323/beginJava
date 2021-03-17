//Thread priority setting and getting
//Thread name setting and getting
//we can set name of thread in two ways one is by using .setName() and the other is by creating a constructor for class
public class ThreadPriority {
    public static void main(String[] args) {
        first f = new first("Hello");
        f.start();
        f.setName("h2");                 //Setting thread name
        System.out.println(f.getName());
        f.setPriority(Thread.MIN_PRIORITY);   //Setting priority to thread (min/norm/max).
        System.out.println(f.getPriority());
    }
}

class first extends Thread{
    public  first(String name){
        super(name);
    }
    public void run(){
        System.out.println("first class");
    }
}
