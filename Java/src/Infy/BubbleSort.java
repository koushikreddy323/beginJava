package Infy;
//In the second for loop in bubbleSort method, traversing is done up to length-1-i as the last value of the array is fixed.
public class BubbleSort {
    public static int noOfSwappings;
    public static int noOfPasses;
    public static void main(String[] args) {
        int []arr={52,31,21,85,95};
        System.out.println("Given Array: ");
        for(int x:arr){
            System.out.println(x);
        }
        bubbleSort(arr);
        System.out.println("Array after bubble sort");
        for (int y:arr){
            System.out.println(y);
        }
        System.out.println("No of passes: "+noOfPasses);
        System.out.println("No of swappings: "+noOfSwappings);

    }

    public static void bubbleSort(int [] arr){
        int length=arr.length;
        for(int i=0;i<length-1;i++){
            boolean swapped=false;
            noOfPasses++;
            for(int j=0;j<(length-i-1);j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public static void swap(int[] arr,int index1,int index2){
        int temp=arr[index2];
        arr[index2]=arr[index1];
        arr[index1]=temp;
        noOfSwappings++;

    }
}
