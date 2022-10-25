import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {2,2,1,1,1,2,2,5,5,5,5,5,6,6,6,6,1,2,3,4,5,6,6,6,1,2,3,4,5,6,6,6,6,6}));
    }

    public static int majorityElement(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);
        int largestStreakNum = 0;
        int largestStreak = 1;
        int currentStreak = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }
            if (currentStreak > largestStreak) {
                largestStreak = currentStreak;
                largestStreakNum = nums[i];
            }
        }
        return largestStreakNum;
    }
}