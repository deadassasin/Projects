import java.util.Scanner;

public class IdentityMatrix {

    public static void main(String[] args) {

        int matrix[][] = new int[5][5];
        mtr(matrix);
    }

    public static void mtr(int [][] matrix){
        for(int i=0; i<5; i++){
            for(int j =0; j<matrix.length; j++){
                if(i == j){
                    matrix[i][j] = 1;
                }
                else{
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i = 0; i<5; i++){
            for(int j = 0; j<matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("  ");
        }
    }
}
