public class MethodSample {
    int adding(int x,int y){                           //Method
        return x+y;
    }
    public static void main(String[] args) {           //main function

        MethodSample ad=new MethodSample();           //creating class
        int c=ad.adding(5,10);

        System.out.println(c);

    }
}
