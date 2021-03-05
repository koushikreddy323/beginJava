//VarArgs is used to read data when the parameters or arguments are not defined
public class VarArgs {
    static int sum(int ...arr){
        int result=0;
        for(int e:arr){
            result=result+e;

        }
        return result;
    }

    public static void main(String[] args) {


        System.out.println("the sum is: "+sum(10,20,30,40,50));
    }
}
