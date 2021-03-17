//For classes use threads and Runnable for interface.
//Thread Priority.
/*public class MultiThreadingCode {
    public static void main(String[] args) {
        hi obj1=new hi();
        Hello obj2=new Hello();
        obj1.start();     //Starting the Thread with start keyword where run should be the functionality(method).
        try {Thread.sleep(50);} catch (Exception e){}   //This is to get non collisional outputs
        obj2.start();

    }
}



class hi extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi");
            try{Thread.sleep(500);} catch (Exception e){}       //sleep time of 0.5 min
        }
        }
    }

    class Hello extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try{Thread.sleep(500);} catch (Exception e){}
            }
        }

    }

 */

// Using Runnable for interfaces.

public class MultiThreadingCode {
    public static void main(String[] args) {
        hi obj1=new hi();
        Hello obj2=new Hello();

        Thread t1=new Thread(obj1);   //Threads should be created to execute Runnable Interfaces.
        Thread t2=new Thread(obj2);

        t1.start();     //Starting the Thread with start keyword where run should be the functionality(method).
        try {Thread.sleep(50);} catch (Exception e){}   //This is to get non collisional outputs
        t2.start();
        t1.setPriority(Thread.MIN_PRIORITY);       //Setting priority of thread
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());      //Getting priority of thread.
        System.out.println(t2.getPriority());

    }
}



class hi implements Runnable{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi");
            try{Thread.sleep(500);} catch (Exception e){}       //sleep time of 0.5 min
        }
    }
}

class Hello implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try{Thread.sleep(500);} catch (Exception e){}
        }
    }

}

