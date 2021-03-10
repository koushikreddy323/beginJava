import java.util.Scanner;
import java.util.Random;
class start{
    public int getRandomNum(int max,int min){
        Random rand = new Random();
        return rand.nextInt(max-min)+min;

    }
}
public class GuessTheNumber {
    public static void main(String[] args) {
        start s=new start();
        System.out.println(s.getRandomNum(10,20));

    }
}
