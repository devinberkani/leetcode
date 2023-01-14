import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[] {10,2,5,10,9,1,1,4,3,7}));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] r = new int[nums.length + 1];
        for (int num : nums) {
            r[num] = num;
        }
        List<Integer> result = new ArrayList<>(r.length);
        for (int i = 1; i < r.length; i++) {
            if (r[i] == 0) {
                result.add(i);
            }
        }
        return result;
    }
}