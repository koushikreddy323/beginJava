import java.util.Random;
import java.util.Scanner;


public class RockPaperScissor {

    public static void main(String[] args) {
        int i=0;
        while (i<5) {

            String s = "";
            Random rand = new Random();
            int r1 = rand.nextInt(3);
            System.out.println("Enter in numbers:\n1.Rock 2.Paper\t3.Scissor");
            Scanner sc = new Scanner(System.in);
            int user = sc.nextInt();
            switch (user) {
                case 1 -> System.out.println("You selected Rock.");
                case 2 -> System.out.println("You selected Paper.");
                case 3 -> System.out.println("You selected scissor.");
                default -> System.out.println("Invalid Selection.");
            }


            if (user <= 3 && user > 0) {
                switch (r1) {
                    case 0 -> System.out.println("comp selected Rock.");
                    case 1 -> System.out.println("comp selected Paper.");
                    case 2 -> System.out.println("comp selected scissor.");
                }


                if (r1 == 0 && user == 1 || r1 == 1 && user == 2 || r1 == 2 && user == 3) {
                    System.out.println("draw");
                } else if (r1 == 0 && user == 2) {
                    System.out.println("you won!");
                } else if (r1 == 0 && user == 3) {
                    System.out.println("You lost!");
                } else if (r1 == 1 && user == 1) {
                    System.out.println("you lost!");
                } else if (r1 == 1 && user == 3) {
                    System.out.println("you won!");
                } else if (r1 == 2 && user == 1) {
                    System.out.println("you won!");
                } else if (r1 == 2 && user == 2) {
                    System.out.println("You lost!");
                } else {
                    System.out.println("Invalid entry");
                }
            }


            System.out.println(s);
        i++;
        }

    }

}
