import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(matrixReshape(new int[][]{{1, 2},{3, 4}}, 4, 1)));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] a = new int[r][c];
        int matrixLength = mat.length * mat[0].length;
        int comparisonLength = r * c;
        if (matrixLength != comparisonLength) {
            return mat;
        }
        int currentRow = 0;
        int currentColumn = 0;
        for (int[] ints : mat) {
            for (int anInt : ints) {
                matrixLength++;
                a[currentRow][currentColumn] = anInt;
                if (currentColumn + 1 > a[0].length - 1) {
                    currentRow++;
                    currentColumn = 0;
                } else {
                    currentColumn++;
                }
            }
        }
        return a;
    }
}