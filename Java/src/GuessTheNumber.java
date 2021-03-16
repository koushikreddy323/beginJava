import java.util.Scanner;
import java.util.Random;
class start{
    public int noofguesses;
    public int setRandomNum() {
        Random rand = new Random();
        return rand.nextInt(10);
    }

    public int getnoOfGuesses(){
        return noofguesses;
    }
    public void setnoofguesses(int noofguesses){
        this.noofguesses=noofguesses;
    }



    public  int getInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your guessed number between 1 to 10");
        return sc.nextInt();
    }

    boolean isCorrect(){
        noofguesses++;
        if(getInfo()==setRandomNum()){
            return true;
        }
        else {
            return false;
        }

    }

}


public class GuessTheNumber {
    public static void main(String[] args) {
        start s=new start();
        int x=s.getInfo(); //user input
        int y=s.setRandomNum(); //random system input
        System.out.println(y);
        boolean f=s.isCorrect();

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
