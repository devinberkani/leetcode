import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getRow(6));
    }

    public static List<Integer> getRow(int rowIndex) {

        List<Integer> result = new ArrayList<>();
        result.add(1);

        if (rowIndex == 0) {
            return result;
        }

        result.add(1);

        if (rowIndex == 1) {
            return result;
        }

        for (int i = 1; i < rowIndex; i++) {
            List<Integer> prevRow = result;
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j <= i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            row.add(1);
            result = row;
        }

        return result;
    }
}