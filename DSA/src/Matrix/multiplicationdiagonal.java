package Matrix;

import java.util.Scanner;

public class multiplicationdiagonal {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = { { 1, 2, 3, 4 },
                     { 5, 6, 7, 8 },
                    { 9, 10, 11, 12 } };

        int multi = 1;

        for (int i = 0  ; i < mat.length ; i++ ){
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j ){
                    multi *= mat[i][j];
                }
            }
        }

        System.out.println(mat);
    }
}
