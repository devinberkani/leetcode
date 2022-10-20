import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(generate(10));
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        int size = -1;
        int indexA = 0;
        int indexB = 1;
        List<Integer> prevRow = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 0; j < size; j++) {
                row.add(prevRow.get(indexA) + prevRow.get(indexB));
                indexA++;
                indexB++;
            }
            if (i != 0) {
                row.add(1);
            }
            result.add(row);
            prevRow = row;
            indexA = 0;
            indexB = 1;
            size++;
        }

        return result;

    }
}