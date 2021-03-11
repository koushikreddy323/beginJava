//By inheritance we can all the functions from a parent class to child class. Here inh is parent class and inh2 is subclass.

class inh{
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

}
class inh2 extends inh{
    public int  pr(){
        return getX();
    }
}

class inh3 extends inh2{
    inh3(){
        System.out.println("Grand child");
    }
}

public class Inheritance {
    public static void main(String[] args) {
    inh i=new inh3();
    i.setX(10);
    i.setY(20);
        System.out.println(i.getX()+" "+ i.getY());


    }
}
