package Array;

/**
 * @Auther Eternal
 * @Date 2021/9/4
 * 旋转图像
 */
public class ArrayTest11 {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
        rotate(matrix);
        for(int i = 0; i <  matrix.length; i++) {
            int[] array = matrix[i];
            for(int j = 0; j < array.length; j++) {
                System.out.println(array[j]);
            }
        }
    }

    public static void rotate(int[][] matrix) {
        int length = matrix.length;

        for (int i = 0; i < length / 2; i++) {
            for (int j = i; j < length - i - 1; j++) {
                int temp = matrix[i][j];
                int m = length - j - 1;
                int n = length - i - 1;
                matrix[i][j] = matrix[m][i];
                matrix[m][i] = matrix[n][m];
                matrix[n][m] = matrix[j][n];
                matrix[j][n] = temp;
            }
        }
    }
}
