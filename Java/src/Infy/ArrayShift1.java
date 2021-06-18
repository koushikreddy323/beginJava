//Adding an element to Array
package Infy;
import java.util.Scanner;

public class ArrayShift1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the elements in array");
            arr[i] = sc.nextInt();
        }
        System.out.println("The given Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Enter the position where you want to add an element");
        int pos = sc.nextInt();
        //pos=pos-1;
        System.out.println("Enter the element that you wish to add: ");

        for (int i = arr.length - 1; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = sc.nextInt();

        System.out.println("Traversed array: ");
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
