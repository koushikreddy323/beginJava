package swiftFood;

import java.util.Scanner;

//Deleting an element from an Array.
public class ArrayShift2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size= sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the elements in array");
            arr[i]=sc.nextInt();
        }
        System.out.println("The given Array: ");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Enter the position where you want to delete an element");
        int pos=sc.nextInt();
        for(int i=0;i<arr.length-1;i++){
            if(i>=pos-1){
                arr[i]=arr[i+1];
            }
        }
        arr[arr.length-1]=0;


        System.out.println("Traversed array: ");
        for(int x:arr){
            System.out.print(x+" ");
        }

    }
}
