package Arrays;

public class Array1 {
    public static void main(String[] args) {
        int [ ] marks={10,20,30,52,32};
        /*for(int i=marks.length-1;i>=0;i--) {
            System.out.println(marks[i]);
            }
         */

        /*
        for(int i=0;i< marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        */

        for(int element:marks){
            System.out.println(element);
        }
    }
}
