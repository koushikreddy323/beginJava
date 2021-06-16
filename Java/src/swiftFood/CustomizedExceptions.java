package swiftFood;

import java.util.Scanner;




class UnderAgeException extends Exception{
    void show(){
        System.out.println("Under-Aged");
    }
}

class OverAgeException extends Exception{
    void show(){
        System.out.println("Over-Aged");
    }
}

class DLP{
    int age=0;
    void getInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the Age: ");
        age=sc.nextInt();
    }
    void verify1() throws UnderAgeException, OverAgeException {

        if(age<18){
            UnderAgeException a=new UnderAgeException();
            a.show();
            throw a;
        }
        else if(age>65){
            OverAgeException o=new OverAgeException();
            o.show();
            throw o;
        }
        else {
            System.out.println("Your Licence is Granted ☺ \nHappy Driving");
        }

    }
}

class RTO{
    void permit1() {
        DLP d=new DLP();
        try {
            d.getInput();
            d.verify1();
        }
        catch (OverAgeException | UnderAgeException oa) {
            try {
                d.getInput();
                d.verify1();
            } catch (OverAgeException | UnderAgeException oa1) {
                try {
                    d.getInput();
                    d.verify1();
                } catch (OverAgeException | UnderAgeException oa2) {
                    System.out.println("Attempts Expired");
                }
            }
        }
    }
}
public class CustomizedExceptions {
    public static void main(String[] args) {
        System.out.println("   Driving Licence Portal   ");
        RTO r=new RTO();
        r.permit1();

    }
}
