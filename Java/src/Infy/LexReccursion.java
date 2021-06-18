package Infy;

public class LexReccursion {

        public static void main(String[] args) {
            //3pow4
            System.out.println(get(3,4));

        }

        public static int get(int a, int b) {
            if (b == 0) {
                return 1;
            }

            return a * get(a, (b - 1));
        }

    }
