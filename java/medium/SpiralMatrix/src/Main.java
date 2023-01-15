import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
        System.out.println(spiralOrder(new int[][] {{1,2,3},{4,5,6},{7,8,9}}));
        System.out.println();
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int minRow = 0;
        int minColumn = 0;
        int maxRow = matrix.length - 1;
        int maxColumn = matrix[0].length - 1;
        while (result.size() < matrix.length * matrix[0].length) {
            for (int i = minColumn; i <= maxColumn; i++) result.add(matrix[minRow][i]);
            if (result.size() == matrix.length * matrix[0].length) break;
            minRow++;
            for (int i = minRow; i <= maxRow; i++) result.add(matrix[i][maxColumn]);
            if (result.size() == matrix.length * matrix[0].length) break;
            maxColumn--;
            for (int i = maxColumn; i >= minColumn; i--) result.add(matrix[maxRow][i]);
            if (result.size() == matrix.length * matrix[0].length) break;
            maxRow--;
            for (int i = maxRow; i >= minRow; i--) result.add(matrix[i][minColumn]);
            if (result.size() == matrix.length * matrix[0].length) break;
            minColumn++;
        }
        return result;
    }
}