package Arrays;

public class Array3D {
    public static void main(String[] args) {
        int[][][] flats = new int[2][2][2];
        flats[0][0][0] = 101;
        flats[0][0][1] = 102;
        flats[0][1][0] = 201;
        flats[0][1][1] = 202;
        flats[1][0][0] = 301;
        flats[1][0][1] = 302;
        flats[1][1][0] = 401;
        flats[1][1][1] = 402;

        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[1].length; j++) {
                for(int k=0;k< flats[1].length;k++) {


                    System.out.print(flats[i][j][k]);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}
