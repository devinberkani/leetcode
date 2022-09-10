import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfWeakCharacters(new int[][] {{7,9},{10,7},{6,9},{10,4},{7,5},{7,10}}));
//        {{7,9},{10,7},{6,9},{10,4},{7,5},{7,10}}
//        {{10,1},{5,1},{7,10},{4,1},{5,9},{6,9},{7,2},{1,10}}
//        {{1, 1}, {2, 1}, {2, 2}, {1, 2}})
    }


    public static int numberOfWeakCharacters(int[][] properties) {
        int count = 0;
        Arrays.sort(properties, (a, b) -> (b[0] == a[0]) ? (a[1] - b[1]) : (b[0] - a[0]));
        int max = 0;
        for (int[] property : properties) {
            if (property[1] < max) {
                count++;
            }
            max = Math.max(max, property[1]);
        }
        return count;
    }
}