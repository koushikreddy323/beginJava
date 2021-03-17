//For classes use threads and Runnable for interface.

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

        Thread t1=new Thread();   //Threads should be created to execute Runnable Interfaces.
        Thread t2=new Thread();

        t1.start();     //Starting the Thread with start keyword where run should be the functionality(method).
        try {Thread.sleep(50);} catch (Exception e){}   //This is to get non collisional outputs
        t2.start();

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

