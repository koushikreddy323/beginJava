package Infy;
//n is length of rod and the price array is prices of rod of n meters. we have to find the optimal solution to get maximum profit.
public class CutRod {

    public static int cutRod(int[] price, int n) {
        int [] ans=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            int max_value=Integer.MIN_VALUE;
            for(int j=0;j<i;j++){
                max_value=Math.max(max_value,price[j]+ans[i-j-1]);
                ans[i]=max_value;
            }
        }

        return ans[n];
    }



    public static void main(String[] args) {
        int[] price = { 10,24,30,40,45 };
        int n = 5;
        System.out.println("Maximum price: " + cutRod(price, n));
    }
}
