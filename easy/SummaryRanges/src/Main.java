import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[] {1,2,3,4,5,9,28}));
    }

    public static List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();

        if (nums.length == 0) {
            return result;
        }

        StringBuilder currentRange = new StringBuilder();
        int firstInRange = nums[0];
        currentRange.append(firstInRange);
        for (int i = 0; i < nums.length; i++) {
            int nextNum = i != nums.length - 1 ? nums[i + 1] : nums[i];
            if (nextNum != nums[i] + 1) {
                if (nums[i] != firstInRange) {
                    currentRange.append("->").append(nums[i]);
                }
                result.add(currentRange.toString());
                currentRange = new StringBuilder();
                firstInRange = nextNum;
                currentRange.append(firstInRange);
            }
        }

        return result;
    }
}