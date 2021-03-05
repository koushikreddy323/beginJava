public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("0 1");
        int a=0;
        int b=1;
        int n=5;
        for(int i=1;i<=n;i++){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }

    }
}
