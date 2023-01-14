public class Main {
    public static void main(String[] args) {
        rotate(new int[][] {{1}});
        // {1,2,3},{1,4,7},{7,8,9}
        // {4,5,6},{2,5,8},{7,8,9}
        // {7,8,9},{3,6,9},{7,8,9}
    }

    public static void rotate(int[][] matrix) {
        transpose(matrix);
        reflect(matrix);
    }

    public static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
    }
    public static void reflect(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length / 2; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - 1 - j];
                matrix[i][matrix[i].length - 1 - j] = t;
            }
        }
    }
}