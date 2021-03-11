import java.util.Scanner;
import java.util.Random;
class start{
    public int setRandomNum() {
        Random rand = new Random();
        return rand.nextInt(10);
    }



    public  int getInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your guessed number between 1 to 10");
        return sc.nextInt();
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        start s=new start();
        int x=s.getInfo(); //user input
        int y=s.setRandomNum(); //random system input
        System.out.println(y);
        if(x==y){
            System.out.println("your guess is correct!");
        }
        else if(x<y){
            System.out.println("your input is smaller");
        }
        else {
            System.out.println("your input is bigger");
        }

    }
}
