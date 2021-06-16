package swiftFood;

public class GcdUsingReccursion {
    public static void main(String[] args) {
        System.out.println(findGCD(15,20));
    }
    public static int findGCD(int num1,int num2){
        if(num1==0){       //if one of the number is zero then other should be the greatest positive integer.
            return num2;
        }
        if(num2 ==0){
            return num1;
        }
        if(num1==num2){
            return num1;
        }

        if(num1>num2){
            return findGCD(num1-num2,num2);
        }
        return findGCD(num1,num2-num1);
    }
}
