//Exception handling is used to handle run time errors and to continue flow of application

import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        int i,j,k=0;
        int []arr=new int[4];
        i=10;
        j=2;

        try{
            k=i/j;
            for(int c=0;c<4;c++){
                arr[c]=c+1;
            }
            for(int item:arr){
                System.out.println(item);
            }
        }
        catch (ArithmeticException e){              //Arithmetic Exception
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){        //Array index out of bound exception
            System.out.println("Maximum value is 4");
        }
       finally {
            System.out.println("End of program");
        }


    }
}
