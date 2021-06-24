package Infy;
//In this code the passed two parameters are start time and finish time. The logic here is the start time should be greater than or equal-
//to the previous finish time. if the start time is greater than previous finish time then value of j will be assigned to i;
public class GreedyApproach {
    //  1 3 0 5 8 5
    public static int findMaxActivities(int start[], int finish[]) {              //  2 4 6 7 9 9
        int n=finish.length;
        int i = 0;  //4
        int j=0;
        int count=1;               //1+1+1+1
        for(j=1;j<n;j++){    //5
            if(start[j]>=finish[i]){
                count++;
                i=j;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int start[] =  {1, 3, 0, 5, 8, 5};
        int finish[] =  {2, 4, 6, 7, 9, 9};

        System.out.println("Maximum number of activities: "+findMaxActivities(start, finish));
    }
}


